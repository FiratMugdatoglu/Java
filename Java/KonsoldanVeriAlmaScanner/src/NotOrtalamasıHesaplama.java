import java.util.Scanner;

public class NotOrtalamasıHesaplama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int quizNotu, vizeNotu, finalNotu;
		double not;

		System.out.println("Quiz Notunuzu Giriniz: ");
		quizNotu = input.nextInt();

		System.out.println("Vize Notunuzu Giriniz: ");
		vizeNotu = input.nextInt();

		System.out.println("Final Notunuzu Giriniz: ");
		finalNotu = input.nextInt();

		not = (quizNotu * 0.2) + (vizeNotu * 0.35) + (finalNotu * 0.45);

		String yazdirmNotu = (not >= 50) ? "Başarıyla Geçtiniz" : "Kaldınız";

		System.out.println("Notunuz: " + not + " --> " + yazdirmNotu);

	}

}
