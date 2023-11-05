import java.util.Scanner;

public class ManipulasiHurufVokal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();

        
        String kalimatManipulasi = "";

        
        for (int i = 0; i < kalimat.length(); i++) {
            
            char huruf = kalimat.charAt(i);

            
            if (huruf == 'a' || huruf == 'A') {
                kalimatManipulasi += "apa";
            } else if (huruf == 'i' || huruf == 'I') {
                kalimatManipulasi += "ipi";
            } else if (huruf == 'u' || huruf == 'U') {
                kalimatManipulasi += "upu";
            } else if (huruf == 'e' || huruf == 'E') {
                kalimatManipulasi += "epe";
            } else if (huruf == 'o' || huruf == 'O') {
                kalimatManipulasi += "opo";
            } else {
                kalimatManipulasi += huruf;
            }
        }

        
        System.out.println("Kalimat setelah dimanipulasi: " + kalimatManipulasi);
    }
}
