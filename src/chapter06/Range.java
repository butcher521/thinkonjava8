package chapter06;

import java.util.Arrays;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 13:01 2020/5/23
 */
public class Range {
    public static int[] range(int n){
        int [] array=new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=i;
        }
        return array;
    }
    public static int[] range(int start,int end){
        int[] array=new int[end-start];
        for (int i=0;i<end-start;i++){
            array[i]=start+i;
        }
        return array;
    }
    public static int[] range(int start,int end,int step){
        int[] array=new int[(end-start)/step];
        for (int i=0;i<(end-start)/step;i++){
            array[i]=start+i*step;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] range = range( 2,11,2);
        System.out.println(Arrays.toString(range));
    }
}
