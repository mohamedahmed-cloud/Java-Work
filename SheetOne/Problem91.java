//Manpulation with If statement
import java.util.Scanner;

public class Problem91 {
    public static void main(String[]args){
//        Needed
        Scanner scanner=new Scanner(System.in);

//        Our Design
//          To start
        System.out.print("Enter Your Start number : ");
        int start =scanner.nextInt();

//          To skip
        System.out.print("Enter The start of  number you want to skip \" If there is no Enter \"0\" \" : ");
        int skipstart=scanner.nextInt();
        System.out.print("Enter The End of number you want to skip\" If there is no Enter \"0\" \" : ");
        int skipend = scanner.nextInt();
//        To End
        System.out.print("Enter your End number : ");
        int end=scanner.nextInt();


//        Ouput Operation
        int sum=0;
        double average=0;
        int counter=0;
        for (int i=start ; i<=end;i++){
            if (start>end && skipstart>skipend ) {
                System.out.println("End Should be Greater Than Start");
                break;
            }
            if ( skipstart !=0 && skipend !=0 && skipstart<start && skipstart>skipend ){
                System.out.println("End Should be Greater Than Start");
                break;
            }

            if (skipstart<=i && i<=skipend){
                continue;
            }else {
                sum += i;
                counter+=1;
            }


        }
        System.out.println(sum);
        System.out.println(sum/(double)counter);



    }
}
