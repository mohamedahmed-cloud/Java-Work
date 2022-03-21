import java.util.Scanner;

public class Problem9 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("What You want to calculate 1 to calculate square area 2 to calculate rectangular area : ");
        double store=scanner.nextInt();
        while(store!=1 ){
            if(store==2)
                break;
            System.out.println("Please Enter a valid number ");
            System.out.print("Enter \"1\"  to calculate square area \"2\" to calculate rectangular area : ");
            store=scanner.nextInt();
        }
        if(store==1){
            System.out.print("Enter the length of square : ");
            double length= scanner.nextDouble();
            System.out.println(area(length));
        }else if (store==2){
            System.out.print("Enter the length : ");
            double length= scanner.nextDouble();
            System.out.print("Enter the Width : ");
            double width = scanner.nextDouble();
            System.out.println(area(length,width));
        }
    }
    public static double area(double length1,double width){
        double result = length1*width;
        return result;
    }
    public static double area(double length2){
        double result =Math.pow(length2,2);
        return result;
    }

}
