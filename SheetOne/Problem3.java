//to be leap year the year should divided into 4 without the head of century should be divide in 400
import java.util.Scanner;

public class Problem3 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter A Year : ");
        int year=scanner.nextInt();
        if (year%4==0 && year%100!=0)
            System.out.println(year+" Is Leap Year.");
        else if (year%400==0 && year%100==0)
            System.out.println(year+" Is Leap Year.");
        else
            System.out.println(year+" Is Not A Leap year.");

    }

}
