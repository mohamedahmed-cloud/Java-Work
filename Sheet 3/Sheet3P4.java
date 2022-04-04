import java.util.Arrays;

import java.util.Arrays;
public class Sheet3P4 {
    public static void main(String[]args){

        int[][] arrayOne={{1,2,3,},{1,2,3},{1,2,3}};
        int[][] arrayTwo={{1,2,3,},{1,2,3},{1,2,3}};
        System.out.println(Arrays.deepToString((sumTwoArray(arrayOne,arrayTwo))));
    }
    public static double[][] sumTwoArray(int[][]array1,int[][]array2){
        double [][]toReturn=new double[array1.length][array1[0].length];
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1[0].length;j++){
                toReturn[i][j]=array1[i][j]+array2[i][j];
            }
        }return toReturn;
    }

}
