package Chapter1;

import Structure.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Citrix on 2018/8/7.
 */
public class Example2 {
    public static boolean isGreenApple(Apple apple){
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple){
        return apple.getWeight() > 150;
    }
    public interface Predicate<T>{
        boolean test(T t);
    }

    static List<Apple> filterApples(List<Apple> inventoey,
                                    Predicate<Apple> p){
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventoey) {
            if (p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}

