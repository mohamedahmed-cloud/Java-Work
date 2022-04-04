import java.util.Arrays;
import java.util.Scanner;

public class Sheet3p8 {
    public static void main(String[]args){
//        Creating
        double[][]array = new double[3][3];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<array.length;i++){
            for(int j=0;j< array.length;j++){
                array[i][j]=input.nextDouble();
            }
        }
        System.out.println(Arrays.toString(getMax(array)));

    }
//    Creating Method
    public static int[] getMax(double[][] list){
        double max=list[0][0];
        int []maxNumber=new int[2];
        for(int i =0 ;i< list.length;i++){
            for(int j=0;j< list.length;j++){
                if( list[i][j]>max){
                       maxNumber[0]=i;
                       maxNumber[1]=j;
                }
            }
        }return maxNumber;
    }
}
