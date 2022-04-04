public class Sheet3P2 {
    public static void main(String[]args){

    double[] array={1,2,3,4,5,6,7,8,9};
    double max=0;
    for(int i=0;i<array.length;i++){
        if(array[i]>max){
            max=array[i];
        }
    }
        System.out.println(max);
    }
}

