import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Sayı giriniz: ");
		int sayi = scan.nextInt();

		switch (sayi) {
		case 1:
			System.out.println("Girilen sayı 1");
			break;
		case 2:
			System.out.println("Girilen sayı 2");
			break;
		case 3:
			System.out.println("Girilen sayı 3");
			break;
		case 4:
			System.out.println("Girilen sayı 4");
			break;
		default:
			System.out.println("Girilen sayı geçersiz.");
			break;
		}

	}
}
