import java.util.Arrays;

public class CreateArrayByRandom {
    public static void main(String []args){
//        Creating an Array
        int [][] array = new int[4][7];
        for(int i =0 ; i< array.length;i++){
            for(int j =0 ;j<array[0].length;j++){
                array[i][j]=(int)(Math.random()*100);
            }

        }
        System.out.println(Arrays.deepToString(array));
    }
}
