
public class Try {

	public static void main(String[] args) {

		System.out.println("Program başladı");
		int a = 0;

		try {
			a = 2 / 0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(a);
		System.out.println("Program Bitti ! ");

	}

}
