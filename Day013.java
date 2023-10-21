import java.util.Scanner;
public class Day013 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int nilai = sc.nextInt();
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();
        
        System.out.println("jika "+nilai+" lebih kecil dari "+angka+" maka nilainya adalah "+(nilai<angka));
    }
    
}
