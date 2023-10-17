package day009;
import java.util.Scanner;
public class Day009 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Masukkan poin kamu : ");
        double nilai = sc.nextDouble();
        if(nilai >= 90){
            System.out.println("Nilai kamu A");
        } else if (nilai >= 80){
            System.out.println("Nilai kamu B");
        }else if (nilai >= 70){
            System.out.println("Nilai kamu C");
        }else if (nilai >= 40){
            System.out.println("Nilai kamu D");
        }else {
            System.out.println("Nilai kamu E");
        }
    }
    
}
