public class Islemler implements Runnable {
	String name;

	public Islemler(String name) {
		this.name = name;
		System.out.println(name + "İşlem oluştu");
	}

	@Override
	public void run() {

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(this.name + " İşlem : " + i);
				Thread.sleep(1000);
			}

		} catch (Exception e) {
			System.out.println(this.name + "Hata ile karşılaştı ");
		}

		System.out.println(name + "işlem bitti");

	}

}
