import java.util.Scanner;

public class DaireneAlanıÇevresiHesaplama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double pi = 3.14, yarıcap, alan, hacim;

		System.out.println("Dairenin YarıÇapını Giriniz: ");
		yarıcap = input.nextDouble();

		alan =  2 * pi * yarıcap;
		hacim =pi * yarıcap * yarıcap;

		System.out.println("Dairenin Alanı: " + alan);
		System.out.println("Dairenin Çevresi: " + hacim);

	}

}
