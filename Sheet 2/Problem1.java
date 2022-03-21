//import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[]args){
        System.out.println();
        Scanner scanner=new Scanner(System.in);
        System.out.println(inch(scanner.nextDouble()));
        System.out.println(cen(scanner.nextDouble()));

    }
    public static double inch(double a){
        double c=0;
//        I don't know do this equation is correct or not.Here I am focus on how to write code not the result
        c=a*2.54/100;
        return c;


    }
    public static double cen(double b){
        double c=0;
        c=b/100;
        return c;
    }
}
