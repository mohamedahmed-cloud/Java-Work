import java.util.Scanner;

public class Problem5 {
    public static void main(String []args){
        int result=1;
        for(int i=2;i<100;i++){
            for(int j=2;j<i;j++){
                if(i%j==0)
                    result=0;
            }if(result==1)
                System.out.println(i);
//            reset the result
            result=1; //This is the most important line of program
        }
    }


}
