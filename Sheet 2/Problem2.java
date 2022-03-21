//For This Problem there is a solution with Math You can check it
/*
  int a ,b,c,x,y;
        a=2;
        b=0;
        c=4;
        x=0;
        y=0;
        x=Math.max(a,b);
        y=Math.max(x,c);
        System.out.println(y);
 */
import java.util.Scanner;

public class Problem2 {
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println(min(scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));
        System.out.println(max(scanner.nextInt(),scanner.nextInt(),scanner.nextInt() ));

    }
    public static int max(int a ,int b , int c){
        if(a>b){
            if(a>c)
                return a;
            else
                return c;
        } else if(b>a){
            if(b>c)
                return b;
            else
                return c;
        }else if(a==b) {
            if(a>c)
                return a;
            else
                return c;
        }else return a;
    }
    public static int min(int a ,int b , int c) {
        if (a > b) {
            if (b > c)
                return c;
            else
                return b;
        } else if (b > a) {
            if (a > c)
                return c;
            else
                return a;
        } else if (a == b) {
            if (a > c)
                return c;
            else
                return a;
        } else return a;
    }
}
