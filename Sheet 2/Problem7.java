import java.util.Scanner;

public class Problem7 {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        int millSecond=scanner.nextInt();
        System.out.println(convertMillis(millSecond));
    }
    public static String convertMillis(int millSecond){
            int hour=0;
            int minute=0;
            int trim=0;
            int second=0;
            String result="";
            int convert=millSecond/1000;
            second=convert%60;
            trim =convert/60;
            minute=trim%60;
            hour=trim/60;
            result =hour+":"+minute+":"+second;

            return result;



            }


    }



