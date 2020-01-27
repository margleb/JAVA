/*
 * RuntimeException - это такие исключения которые являются базовыми 
 * как в этом примере делить на ноль незлья и не могут быть
 * записаны. Поэтому их не нужно обьявлет в конструкторе try/catch или trow.
 */
public class Application {
	public static void main(String[] args) {
		
		/* вариант 1 */
		// int value = 7;
		// value = value/0;
		
		/* вариант 2 */
		// String text = null;
		// System.out.println(text.length());
		
		/* вариант 3 */
		String[] texts = {"one", "two", "three"};
		
		try {
			System.out.println(texts[3]);	
		} catch (RuntimeException e) {
			System.out.println(e.toString());
		}
		
	}
}
