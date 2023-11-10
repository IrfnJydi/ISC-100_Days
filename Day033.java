import java.util.Arrays;

public class Day032 {

    public static void BubbleSort(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0;j< arr.length-i-1;j++){
                if (arr[j] > arr[j+1]){
                    double cinta = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=cinta;
                }
            }
        }
    }
    public static void main(String[] args) {
        
        double [] dataarray = {2.09,3.87,6.32,7.01,4.0,1.23};
        BubbleSort(dataarray);
        System.out.println(Arrays.toString(dataarray));
    }
}