
public class Recursive {

	static int f(int x) {
		int toplam = 0;
		for (int i = 1; i <= x; i++) {
			toplam += i;
		}
		return toplam;
	}

	static int r(int x) {
		if (x == 1) {
			return 1;
		}

		return x + r(x - 1);

	}

	public static void main(String[] args) {

		// Özyinelemeli
		// f(1)=1
		// f(2)=f(1) + 2
		// f(3)=f(2) + 3
		// ...
		// ...
		// f(6)=f(5)+6
		// f(7)=f(6)+7

	}
}