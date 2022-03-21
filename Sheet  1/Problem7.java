import java.util.Scanner;

public class Problem7 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        double sum=0;
        for(int i=1 ; i<=10;i++){
            System.out.print("Enter Grade of Student " +i+ " : ");
            double grade =scanner.nextDouble();
            sum+=grade;


        }
        System.out.println(sum/10);
    }
}
