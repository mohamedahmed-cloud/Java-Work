import java.text.NumberFormat;
import java.util.Scanner;

public class Frist {
    public static void main (String [] args) {
//      I don't know the Operation is correct or not by the thing that interest me the the code is correct
        Scanner Name =new Scanner(System.in);
        System.out.print("Principal : ");
        double principal=Name.nextDouble();
        System.out.print("Annual Interested Rated : ");
        double Annual=Name.nextDouble();
        System.out.print("Period(Years) : ");
        double period=Name.nextDouble();
        NumberFormat Currancy = NumberFormat.getCurrencyInstance();
        double result1=(principal*( Annual * Math.pow((1+Annual),period))/(Math.pow((1+Annual),period)-1));
        String results = Currancy.format((double) principal / Annual);
        System.out.print("Mortgage" +results);

    }
}
