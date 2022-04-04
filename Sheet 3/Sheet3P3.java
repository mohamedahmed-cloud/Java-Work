public class Sheet3P3 {
    public static void main(String[] args) {
//        I find it isn't important
        double[] array = {5,6,8};
        System.out.println(standardDivision((array)));
    }

    public static double standardDivision(double[] list) {
        double mean = 0;
        double sum = 0;
        double square=0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        mean = sum / list.length;
        for(int i=0;i<list.length;i++){
            square+=Math.pow(list[i]-mean,2);
        }

        System.out.println(mean);
        System.out.println(square);

        double out = Math.sqrt(square/ (list.length - 1));
        return out;
}

}
