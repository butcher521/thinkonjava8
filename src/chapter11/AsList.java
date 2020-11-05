package chapter11;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:55 2020/5/28
        */
class Snow{}
class Power extends Snow{}
class Crust extends Snow{}
class Slush extends Snow{}
class Winter extends Power{}
class Summer extends Power{}
public class AsList {
    public static void main(String[] args) {
        List<Snow> list= Arrays.asList(new Power(),new Crust(),new Slush());
        List<Snow> list2=Arrays./*<Snow>*/asList(new Winter(),new Summer());
        System.out.println(list);
        System.out.println(list2);
        List<Integer> collection=new ArrayList<Integer>() ;

    }

}
