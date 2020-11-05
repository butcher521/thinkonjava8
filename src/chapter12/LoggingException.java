package chapter12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:03 2020/5/29
 */
public class LoggingException extends Exception{
    private static Logger logger=Logger.getLogger("LoggingException");
    public LoggingException(){
        StringWriter stringWriter = new StringWriter();
        printStackTrace(new PrintWriter(stringWriter));
        logger.severe(stringWriter.toString());
    }
}
class LoggingExceptions{
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        }catch (LoggingException e){
            System.err.println(e);
        }

    }
}
