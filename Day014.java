import java.util.Scanner;
public class Day014 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int angka = sc.nextInt();
        if(angka>2){
            System.out.println("Salah");
        }else if(angka>3){
            System.out.println("Benar");
        }else {
            System.out.println("Santui");
        }
        
        
    }
}
