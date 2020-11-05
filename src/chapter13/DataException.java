package chapter13;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:26 2020/5/29
 */
public class DataException extends Exception {
    public DataException(int id,int id2,String name){
        super(String.format("(id1:%d;id2:%d)  %s\n)",id,id2,name));
    }

    public static void main(String[] args) {
        try {
            throw new DataException(3,2,"你好！");
        }catch (DataException e){
            e.printStackTrace();
        }
    }
}
