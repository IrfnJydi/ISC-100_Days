import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai m: ");
        int m = input.nextInt();

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        for (int i = m+1; i < n; i++) {
            System.out.print(i + ",");
        }
    }
}