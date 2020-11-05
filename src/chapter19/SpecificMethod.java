package chapter19;

import java.text.DateFormat;
import java.util.Date;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:54 2020/6/4
 */
public enum  SpecificMethod {
    DATE_TIME{
        String  getInfo(){
           return DateFormat.getDateInstance().format(new Date());
        }
    },
    CLASS_PATH{
        String getInfo(){
            return System.getenv("CLASS_PATH");
        }
    },
    VERSION{
        String getInfo(){
            return System.getProperty("Java.version");
        }
    };
abstract String getInfo();
    public static void main(String[] args) {
        for (SpecificMethod value : values()) {
            System.out.println(value.getInfo());
        }
    }


}
