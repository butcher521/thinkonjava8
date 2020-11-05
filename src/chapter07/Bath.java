package chapter07;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 17:55 2020/5/23
 */
public class Bath {
    private String s1 = "happy";
    private String s2 = "happy";
    private String s3;
    private String s4;
    private Soap soap;
    public Bath(){
        System.out.println("bath");
        s3="joy";
        soap=new Soap();
    }

    @Override
    public String toString() {
        if(s4==null){
            s4="joy";
        }
        return s1+s2+s3+s4+ ""+soap;
    }

    public static void main(String[] args) {
        Bath bath=new Bath();
        System.out.println(bath);
    }
}

class Soap {
    private String s;

    Soap() {
        System.out.println("soap");
        s = "construction";
    }

    public String toString() {
        return s;
    }
}
