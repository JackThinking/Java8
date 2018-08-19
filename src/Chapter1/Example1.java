package Chapter1;

import Structure.Apple;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Citrix on 2018/8/7.
 */
public class Example1 {
    public static List<Apple> filterGreenApples(List<Apple> inventoey){
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventoey) {
            if ("green".equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventoey){
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventoey) {
            if (apple.getWeight()>150){
                result.add(apple);
            }
        }
        return result;
    }
}
