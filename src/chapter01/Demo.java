package chapter01;

import org.omg.CORBA.OBJ_ADAPTER;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 16:02 2020/7/7
 */
public class Demo {


    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.iterator().forEachRemaining(element-> System.out.println(element));
    }
}
