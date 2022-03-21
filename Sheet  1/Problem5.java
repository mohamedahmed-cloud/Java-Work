import java.util.Scanner;

public class Problem5 {
    public static void main(String[]args ){
        Scanner scanner=new Scanner(System.in);
        double[] array=new double[3];
        for (int i =1 ; i<=3; i ++ ){
            System.out.print("Enter "+i+" Edge : ");
            double edge=scanner.nextDouble();
            array[i-1]=edge;
        }
        double first=array[0],second=array[1],thrid=array[2];
        if ((first<second+thrid)||(second<first+thrid)||(thrid<first+second))
            System.out.println(first+second+thrid);
        else
            System.out.println("Your input in Not Valid at all. ");


    }
}
