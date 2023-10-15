import java.util.Scanner;

public class BilanganGenapHabisBagi5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        System.out.println("Bilangan genap yang habis dibagi 5:");
        for (int i = 1; i <= angka; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}
