import java.util.Scanner;

public class Sheet3P6 {
    public static void main (String[]args){
//        Crrating an Array
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number of row : ");
        int row=input.nextInt();
        System.out.print("Enter the Number of column : ");
        int coloum=input.nextInt();
        System.out.println("Take Care your array has "+row+ " And "+ coloum);
        double [][] array=new double[row][coloum];
//        Add element in the Array
        for(int i =0 ; i< array.length;i++){
            for(int j=0;j<array[0].length;j++){
                array[i][j]=input.nextDouble();
            }
        }
//        Passing A value For Array
        for(int i =0 ;i<array[0].length;i++){
            System.out.println("Sum of the element at column "+i+"is "+sumSpecificColumn(array,i));
        }


    }
//    Creating A method
    public static double sumSpecificColumn(double [][] list,int coloum){
        double sum=0;
        for(int i=0;i<list.length;i++){
            sum+=list[i][coloum];
        }return sum;
    }
}