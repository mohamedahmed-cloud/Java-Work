
import java.util.Scanner;

public class Problem8 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        double side=scanner.nextDouble();
        System.out.println(area(side));
//        System.out.println(Math.tan((3.14/5)));

    }
    public static double area(double side){
        double area=0;
        final double PI=3.14;
//      Note that the tan should enter on it a rad value not degree value to give you a correct value
        area=(5*Math.pow(side,2))/(4*Math.tan(PI/5));



     return area;
    }
}
