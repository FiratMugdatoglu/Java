
public class Sinif {

	public static void main(String[] args) {
		// Object Oriented Programming
		// SınıfAdı ObjeAdı = new SınıfAdı();

		/*
		 * HesapMakinesi makine1 = new HesapMakinesi();
		 * 
		 * makine1.sayi1 = 10; makine1.sayi2 = 20;
		 * 
		 * System.out.println(makine1.sayi1);
		 * 
		 * HesapMakinesi makine2 = new HesapMakinesi(); makine2.sayi1 = 20;
		 * 
		 * System.out.println(makine2.sayi1);
		 */

		// Constructor (Yapıcı) Kullanımı ve Sınıf Metotları

		/*
		 * HesapMakinesi makine1; makine1 = new HesapMakinesi(1, 3);
		 * System.out.println(makine1.sayi1 + " - " + makine1.sayi2); makine1.sayi1 =
		 * 10; makine1.sayi2 = 20; System.out.println(makine1.sayi1 + " - " +
		 * makine1.sayi2);
		 */

		System.out.println(HesapMakinesi.PI);

		HesapMakinesi m1 = new HesapMakinesi(10, 5, "siyah");

		System.out.println(m1.toplama());
		System.out.println(m1.cikarma());
		System.out.println(m1.carpma());
		System.out.println(m1.bolme());

		HesapMakinesi m2 = new HesapMakinesi(20, 3, "mavi");
		System.out.println(m2.toplama());
	}

}
