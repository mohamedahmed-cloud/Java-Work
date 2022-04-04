import java.util.Arrays;
import java.util.Scanner;

public class Sheet3P7 {
    public static void main(String []args){
//        Creating An array
        double [] array=new double[10];
//        Adding in Array
        Scanner input=new Scanner(System.in);
        for(int i =0 ; i<array.length;i++){
            array[i]= input.nextDouble();
        }
//        To sort on two line of code use the "Arrays.sort(ArrayName)=>To Sort from low to high"
//        Arrays.sort(array);
//        System.out.println(array);
//        Passing Value to Array
        System.out.println(Arrays.toString(Sorting(array)));
    }
//    Creating Method
    public static double [] Sorting(double [] list){

        for(int i=0 ; i<list.length;i++) {
            for(int j=0;j<list.length;j++){
                if (list[i]>list[j]){
                        double temp=list[i];
                        list[i]=list[j];
                        list[j]=temp;
                }
            }
        }return list;
    }
}