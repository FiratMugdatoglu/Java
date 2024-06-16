
public class Main {

	public static void main(String[] args) {
		/*
		 * Calisan c = new Calisan(); c.giris(); Akademisyen a = new Akademisyen();
		 * a.giris(); Memurlar m = new Memurlar(); m.giris();
		 */

		/*
		 * Calisan c = new Calisan(); Memurlar m = new Memurlar(); Güvenlik g = new
		 * Güvenlik(); OgretimUyesi o = new OgretimUyesi(); o.derseGir(); Asistan a =
		 * new Asistan(); a.derseGir();
		 */

		// Calisan c = new Calisan("Ahmet", "a@gmail.com", "0545243353");
		//Akademisyen a = new Akademisyen("Ahmet", "a@gmail.com", "0545243353", "CENG", "Hoca", "CENG 101");
		// System.out.println(a.getAdSoyad());

		OgretimUyesi o = new OgretimUyesi("Mehmet", "m@gmail.com", "000", "ceng", "hoca", "ceng 102", "doçent");
		// System.out.println(o.giris());

		// Calisan c = new Calisan("Veli", "a@gmail.com", "0545243353");
		// System.out.println(c.giris());

		// Polymorphism (Çok Biçimlilik)
		// Calisan c2 = new Akademisyen("Ahmet", "a@gmail.com", "0545243353", "CENG",
		// "Hoca", "CENG 101");
		// System.out.println(c2.giris());

		// Calisan[] girisListesi = { a, o };
		// Calisan.listele(girisListesi);
		
		
		o.derseGir(10);
	}

}
