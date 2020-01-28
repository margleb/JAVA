public class Application {

	public static void main(String[] args) {
		// E.g 4! = 4*3*2*1 (factorial 4)
		System.out.println(factorial(4));
		
	}

	private static int factorial(int value) {
		System.out.println(value);
		if (value == 1) {
			return 1;
		}
		// рекрусинвный вызов метода
		return factorial(value - 1) * value;
	}
}
