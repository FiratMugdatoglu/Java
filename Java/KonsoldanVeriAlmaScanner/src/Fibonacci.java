
public class Fibonacci {

	static int fibo(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}

		return fibo(n - 1) + fibo(n - 2);

	}

	static void f(int x) {
		int sayi1 = 0, sayi2 = 1, toplam = 0, i = 1;

		System.out.print(sayi1 + ",");
		while (i < x) {
			if (x - 1 == i) {
				System.out.print(sayi2);
				break;
			}
			System.out.print(sayi2 + ",");
			toplam = sayi1 + sayi2;
			sayi1 = sayi2;
			sayi2 = toplam;

			i++;

		}

	}

	public static void main(String[] args) {

		f(10);
		System.out.println();
		System.out.println(fibo(10));

	}

}
