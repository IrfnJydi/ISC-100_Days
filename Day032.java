import java.util.Scanner;

public class Day032 {
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        if (m>n){
            int x=m;
            m=n;
            n=x;
        }
        int anu=0;
        for (int i =m+1; i<n;i++){
            if(i==m+1){
                System.out.print(i);
            }else{
                System.out.print(" + "+i);
            }
            anu+=i;
        }
        System.out.println(" = "+anu);
    }
}