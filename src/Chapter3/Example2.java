package Chapter3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Citrix on 2018/8/29.
 */
public class Example2 {
    /*
    * 1
    * */
    /*public static String processFile() throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return br.readLine();
        }
    }*/

    /*
    * 2
    * */
    @FunctionalInterface
    public interface BufferedReaderProcessor{
        String process(BufferedReader b) throws IOException;
    }

    public static String processFile(BufferedReaderProcessor p) throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return p.process(br);
        }
    }

    /*
    * 3
    * */
    String oneLine = processFile((BufferedReader br) -> br.readLine());
    String twoLine = processFile((BufferedReader br) -> br.readLine() + br.readLine());

}
