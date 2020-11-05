package chapter20;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:09 2020/6/4
 */
public class Tracker {
    public static void trackerUseCase(List<Integer> useCase,Class<?> cl){
        for (Method declaredMethod : cl.getDeclaredMethods()) {
            UseCase uc = declaredMethod.getAnnotation(UseCase.class);
            if(uc!=null){
                System.out.println(uc.id()+"  "+uc.description());
            }
            useCase.remove(uc.id());
        }
        for (Integer i : useCase) {
            System.out.println("最后一个是！"+i);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1);
        trackerUseCase(list,UseCase.class);
    }
}
