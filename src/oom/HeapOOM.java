package oom;

import java.util.ArrayList;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 18:42 2020/7/17
 */
public class HeapOOM {
    static class OOMObject{}

    public static void main(String[] args) {
        ArrayList<OOMObject> lis = new ArrayList<>();
        while (true){
            lis.add(new OOMObject());
        }

    }
}
