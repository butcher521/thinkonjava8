package lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 16:30 2020/7/11
 */
@FunctionalInterface
public interface ReadProcess {
    String process(BufferedReader reader) throws IOException;
}
class Demo1{
    public static String processFile(ReadProcess readProcess) throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader(".txt")))
        {
            return readProcess.process(br);
        }
    }

    public static void main(String[] args) throws IOException {
        final String s = processFile((BufferedReader br) -> br.readLine() + br.readLine());

    }
}
