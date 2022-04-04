import java.util.Scanner;

public class Sheet3p10 {
    public static void main(String[]args){
//        Getting the Size of Array &Creating it
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the Length of Your Array : ");
        int length=input.nextInt();
        double [] array = new double[length];


//        Adding an Elements in the Array
        for(int i =0 ; i<length;i++){
            array[i]= input.nextInt();
        }


        boolean isSortedOrNot=isSorted(array);
        if (isSortedOrNot==true){
            System.out.println("The Array is sorted");
        }else
            System.out.println("The Array is Not Sorted");
    }
//    Creating The Method
    public static boolean isSorted(double[] list){
        double first=list[0];
        int check=0;
        for(int i=1;i<list.length;i++){
            if(first<=list[i]){
                first=list[i];

            }
            else{
                check=1;
                break;
            }
        }return check==1?false : true;

    }
}
