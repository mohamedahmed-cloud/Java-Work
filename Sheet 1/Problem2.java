import java.util.Scanner;

public class Problem2 {
     public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         System.out.print("Number : ");
         int input=scanner.nextInt();
         if (input%2==0){
             System.out.println("Even Number");
         }else
             System.out.println("Odd Number");
    }
}
