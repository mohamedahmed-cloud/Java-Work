//As I still practice so i add some thing might not help me on solving this problem but i practice how to use it
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
    public static void main (String []args){
        Scanner scanner=new Scanner(System.in);
        double [] array = new double[3];
        double total=0;
        for (int i=1;i<4;i++){
            System.out.print("Grade of Subject "+i + " : " );
            double grade= scanner.nextDouble();
            array[i-1]=grade;
            total += grade;
        }
        System.out.println(Arrays.toString(array));
        double medium =total/3;
        if ((int)medium>50)
            System.out.println("Good job You are succeed");
        else if ((int)medium==50)
            System.out.println("You are luck you hardly pass");
        else if ((int)medium<50)
            System.out.println("Sorry , dude you failed ");
    }
}
