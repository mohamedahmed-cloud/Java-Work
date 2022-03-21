import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(max(scanner.nextInt(), scanner.nextInt()));
//        System.out.println(max(,scanner.nextInt(), scanner.nextInt()));
        System.out.println(max( scanner.nextInt(), scanner.nextInt(), scanner.nextInt() ));
    }
    public static int max(int a,int b){
        int m;
        if(a>b)
            return a;
        else
            return b;

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
}
