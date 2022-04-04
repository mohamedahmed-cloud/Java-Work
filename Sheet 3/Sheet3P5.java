import java.util.Arrays;
//I don't Understand the Question Very well but if he wants to sum the diagonal of A matrix and return the sum I do it
public class Sheet3P5 {
        public static void main(String[]args){
            int[][] listOne={{9,2,3,},{1,2,3},{1,2,3}};
            System.out.println((sumTwoArray(listOne)));
        }
        public static double sumTwoArray(int[][]list1){
            double sum=0;
            for(int i=0;i<list1.length;i++){
                for(int j=0;j<list1[0].length;j++){
                    if(i==j){
                    sum+=list1[i][j];
                    }
                }
            }return sum;
        }

    }

