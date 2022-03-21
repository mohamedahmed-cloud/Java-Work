import java.util.Scanner;

public class Problem6 {
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Your Grade ,Please : ");
        double grade=scanner.nextDouble();
        if (grade>= 90)
            System.out.println("A");
        else if(grade>=80)
            System.out.println("B");
        else if(grade>=70)
            System.out.println("C");
        else if (grade>=60)
            System.out.println("D");
        else if (grade<60)
            System.out.println("F");
        else
            System.out.println("Enter A Valid Number");
    }
}
