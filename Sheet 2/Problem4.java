import java.util.Scanner;

public class Problem4 {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        if (isPrime(N)==0) {
            System.out.println("The Number is Not Prime");
        }else
            System.out.println("The Number is Prime");

    }
    public static int isPrime(int N){
        for(int i=2;i<N;i++){
            if (N%i==0){
                return 0;
            }
        }return 1;
    }


}
