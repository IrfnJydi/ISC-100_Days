
public class Day19 {
    public static void main(String[] args) {
       
        double [] data2 = {23.4,4.89,1.25,9.38,3.14,22.7};
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int tampung = 0;
        int panjang = data2.length;

        for (int i = 0; i < panjang; i++) {
            if(data2[i]<min){
                min=data2[i];
            }
       }     
     System.out.println("MIN = "+min);
        
 } 
}
  