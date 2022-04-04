import java.util.Scanner;

public class Sheet3p9 {
    public static void main(String[]args){
//        Creating an Array
        double [][] array =new double[2][2];
        Scanner input =new Scanner(System.in);
//        Adding Element
        for(int i =0 ;i< array.length;i++){
            for(int j =0 ;j< array[0].length;j++){
                array[i][j]=input.nextDouble();
            }
        }
//        Finding Largest and Index of it
        double sum=0,newSum=0;
        int out=0;
        int innerIndex=0;
        for(int i=0;i< array.length;i++){
            newSum=0;
            for(int j=0;j< array[0].length;j++){
                newSum+=array[i][j];
                innerIndex=j;
            }
            if(sum<newSum){
                sum=newSum;
                out=innerIndex;
            }
        }
        System.out.println("Max Sum is "+sum+" And it's Index is "+ out);
        System.out.println("Note that the output is the sum of row Not colum");
    }
}
