import java.util.Scanner;

public class MortgagCal {
        public static void main (String[]args){
            Scanner scanner=new Scanner(System.in);
            System.out.print("Pricipal ($1K - $1M) : ");
            double principal=scanner.nextDouble();
            while(true){
                if (principal<1000 || principal>1_000_000){
                    System.out.println("Enter a number between 1,000 and 1,000,000.");
                    System.out.print("Pricipal ($1K - $1M) : ");
                    principal=scanner.nextDouble();


                }else
                    break;

            }
            System.out.print("Annual Interest Rate : ");
            double Annual=scanner.nextDouble();
            while(true){
                if (Annual<=0 || Annual>30) {
                    System.out.println("Enter a value greater than 0 and less than or eqaul 30.");
                    System.out.print("Annual Interest Rate : ");
                    Annual = scanner.nextDouble();

                }
                else
                    break;

            }
            System.out.print("Period (Years) : ");
            double Year=scanner.nextDouble();
            while(true) {
                if (Year <= 0 || Year > 30) {
                    System.out.println("Enter a value between 1 and 30.");
                    System.out.print("Period (Years) : ");
                    Year = scanner.nextDouble();
                }else
                    break;
            }
//make you operator here and give the result
// the Operator is so easy and it do it before

        }

    }

