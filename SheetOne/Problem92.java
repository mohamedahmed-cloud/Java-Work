import java.util.Scanner;

public class Problem92 {
    public static void main(String[]args){
//        Input Operation
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter The Cofficient of x^2 : ");
        double a=scanner.nextDouble();
        System.out.print("Enter The Cofficient of X : ");
        double b=scanner.nextDouble();
        System.out.print("Enter The number : ");
        double c=scanner.nextDouble();


//        Ouptut Operation
        double n1,n2;
        double b2,bAC;
        b2=Math.pow(b,2);
        bAC=Math.pow((b2-4*a*c),0.5);
        n1=(-b+bAC)/2*a;
        n2=(-b-bAC)/2*a;
        if ((b2-4*a*c)<=0)
            System.out.println("The Cofficients if Complex Try Again.");
        else{
        System.out.println("The First Cofficient is : "+n1);
        System.out.println("The Second Cofficient is : "+n2);

        }


    }
}
