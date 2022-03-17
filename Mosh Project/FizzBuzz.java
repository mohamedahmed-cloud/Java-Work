import java.util.Scanner;

public class FizzBuzz {
    public static void main (String[]args){
        System.out.print("Number : ");
        Scanner number=new Scanner(System.in);
        int BuzzFizz=number.nextInt();
        if (BuzzFizz % (5*3) ==0 ){
            System.out.println("FizzBuzz");
        }
        else if (BuzzFizz%3==0) {
            System.out.println("Buzz");

        }
        else if(BuzzFizz%5==0){
            System.out.println("Fizz");

        }
        else {
            System.out.println(BuzzFizz);
        }



    }
}
