
public class Metodlar {
	
	static void power2(int a, int b) {
		int result = 1;
		for (int i = 1; i <= b; i++) {
			result *= a;
		}
		System.out.println(result);
	}


	static int power(int a, int b) {
		int result = 1;
		for (int i = 1; i <= b; i++) {
			result *= a;
		}
		return result;
	}


	public static void main(String[] args) {

		int r = power(10, 2);
		System.out.println(r);

	}

}
