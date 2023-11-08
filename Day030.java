import java.util.Scanner;

public class Day030 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan Tinggi (meter): ");
        double tinggi = input.nextDouble();

        System.out.print("Masukkan Ukuran Baju: ");
        char ukuranBaju = input.next().charAt(0);

        System.out.print("Status Mahasiswa (true/false): ");
        boolean statusMahasiswa = input.nextBoolean();

        System.out.println("\nData Pribadi:");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi: " + tinggi + " meter");
        System.out.println("Ukuran Baju: " + ukuranBaju);
        System.out.println("Status Mahasiswa: " + statusMahasiswa);

        input.close();
    }
}
