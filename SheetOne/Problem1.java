import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//How to differentiate between int,float in java
public class Problem1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number : ");
        float input = scanner.nextFloat();
        int integerOne = (int) input;
//        Operator
        if(input==integerOne)
            System.out.println("Integer Number");
        else
            System.out.println("Float Number");
    }
}
