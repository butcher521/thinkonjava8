package chapter04;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 22:03 2020/5/22
 */
public class ForTest {
    public static void main(String[] args) {/*字节的范围是正的127到-128*/
      /*  for (char c=0;c<128;c++){
            if(Character.isLowerCase(c)){
                System.out.println(c);
            }
        }*/
        for(int i=1,j=i+10;i<5;i++,j=i*2){
            System.out.println(i+""+j);
        }
    }
}
