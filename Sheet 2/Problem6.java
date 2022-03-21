//Note that the Number should begin from 1 to be in Fibonacci sequence not 1 as in sheet
public class Problem6 {

        public static void main(String args[]){
            int n1=0;
            int n2=1;
            int n3;
            int counter=20;
            System.out.print(n1+ " "+n2);
            for(int i=2 ; i<counter;i++){
                n3=n1+n2;
                System.out.print(" "+n3);
                n1=n2;
                n2=n3;

            }
        }

}
