import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan nama : ");
		String nama = input.nextLine();
		
		System.out.println("Nama kamu Adalah : "+nama);
	}
}