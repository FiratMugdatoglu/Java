
public class Main {

	public static void main(String[] args) {
		// Encapsulation (Sarmallama ,Kapsülleme)
		// Inheritance (Kalıtım)
		// Polymorphism (Çok Biçimlilik)
		// Abstraction (Soyutlama)

		Book b1 = new Book("Harry Potter", 400, "Rowling", "Kodlama Vakti");

		System.out.println(b1.getNumberOfPage());
		b1.setNumberOfPage(500);
		System.out.println(b1.getNumberOfPage());

		Book b2 = new Book("Lord Of The ", 500, "Peter Jackson", "Kodlama");

		b2.setName("Lord Of The Rings");
		System.out.println(b2.getName());

	}

}
