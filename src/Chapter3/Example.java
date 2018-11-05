package Chapter3;

/**
 * Created by Citrix on 2018/8/29.
 */
public class Example {


    public static void process(Runnable r){
        r.run();
    }

    public static void main(String[] args) {
        Runnable r1 = ()->System.out.println("hello world 1");
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world 2");
            }
        };
        process(r1);
        process(r2);
        process(()->System.out.println("hello world 3"));
    }

}
