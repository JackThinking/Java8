//package Chapter2;
//
//import Structure.Apple;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Citrix on 2018/8/7.
// */
//public class Example1 {
//    /*
//    * step1:选出绿苹果
//    * */
//    public static List<Apple> filterGreenApples(List<Apple> inventory){
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple: inventory) {
//            if ("green".equals(apple.getColor())){
//                result.add(apple);
//            }
//        }
//        return result;
//    }
//    /*
//    * step2:选出某颜色苹果
//    * */
//    public static List<Apple> filterApplesByColor(List<Apple> inventory,
//                                                   String color){
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple: inventory) {
//            if (apple.getColor().equals(color)){
//                result.add(apple);
//            }
//        }
//        return result;
//    }
//    /*
//    * step3:选出某重量苹果(已经大量复制代码，违背了DRY原则)
//    * */
//    public static List<Apple> filterApplesByWeightApple(List<Apple> inventory,
//                                                  int weight){
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple: inventory) {
//            if (apple.getWeight()>weight){
//                result.add(apple);
//            }
//        }
//        return result;
//    }
//    /*
//    * step4:将颜色和重量结合成一个方法，称为filter（炒鸡拙劣）
//    * */
//    public static List<Apple> filterApples(List<Apple> inventory, String color, int weight, boolean flag){
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple: inventory) {
//            if ((flag && apple.getColor().equals(color))||(!flag && apple.getWeight()>weight)){
//                result.add(apple);
//            }
//        }
//        return result;
//    }
//    /*
//    * step5:行为参数化
//    * */
//    public interface ApplePredicate{
//        boolean test(Apple apple);
//    }
//
//    public class AppleHeavyWeightPredicate implements ApplePredicate{
//        public boolean test(Apple apple){
//            return apple.getWeight()>150;
//        }
//    }
//
//    public class AppleGreenColorPredicate implements ApplePredicate{
//        public boolean test(Apple apple){
//            return "Green".equals(apple.getColor());
//        }
//    }
//
//    static List<Apple> filterApples(List<Apple> inventory,
//                                    ApplePredicate p){
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple: inventory) {
//            if (p.test(apple)){
//                result.add(apple);
//            }
//        }
//        return result;
//    }
//
//    List<Apple> greenApples = filterApples(inventory,new AppleGreenColorPredicate());
//
//    /*
//     * 接下去不想编写这么多实现苹果预测接口的类，怎么办呢？
//     * 使用匿名类
//    * */
//
//    List<Apple> redApples = filterApples(inventory, new ApplePredicate()
//    {
//        public boolean test(Apple apple){
//            return "red".equals(apple.getColor());
//        }
//    });
//
//    /*
//    * 匿名类还是不够好，因为还是要创建一个对象，实现test方法
//    * */
//
//    /*
//     * step6:使用lambda表达式
//     * */
//    List<Apple> result = filterApples(inventory,(Apple apple) -> "red".equals(apple.getColor()));
//
//    /*
//     * step7:将List抽象化
//     * */
//
//    public interface Predicate<T>{
//        boolean test(T t);
//    }
//
//    public static <T> List<T> filter(List<T> list, Predicate<T> p){
//
//        List<T> result = new ArrayList<>();
//        for (T e: list){
//            if (p.test(e)){
//                result.add(e);
//            }
//        }
//        return result;
//    }
//
//    List<Apple> redAppless = filter(inventory,(Apple apple)-> "red".equals(apple.getColor()));
//
//    List<Integer> evenNumbers = filter(nums,(Integer i) -> i%2 == 0);
//
//
//
//
//
//}
