import java.util.Scanner;

public class Problem90 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int pos=0;
        int neg=0;
        System.out.print("Enter A Number : ");

        double number = scanner.nextInt();
        while(number!=0){
            if (number>0)
                pos+=1;
            else if(number<0)
                neg+=1;
            System.out.print("Enter A Number : ");
            number = scanner.nextInt();

        }
        System.out.println("Positive Number is : "+pos);
        System.out.println("Negative Number is : "+ neg);
    }
}
