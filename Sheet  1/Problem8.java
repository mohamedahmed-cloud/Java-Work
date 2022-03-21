import java.util.Scanner;

public class Problem8 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        double sum=0;
        System.out.print("Enter the Number you Want to Start Counter from  : ");
        int start= scanner.nextInt(); //to Determine the value you want to start with
        System.out.print("Enter the Number you Want to End with : ");
        int End=scanner.nextInt(); //to Determine the value you want to end by
        if (start<End){
            for( start=1 ;start<=End;start++){
                sum+=(1.0/(double) start);
            }
        }else
            System.out.println("Start Number shoud be less than end number ");
        System.out.println(sum);

    }
}
