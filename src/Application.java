public class Application {
	public static void main(String[] args) {
		
	    // создание массива words и резерв. памяти
		String[] words = new String[3];
		// присваивание
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println(words[2]);
		
		// создание массива и присваивание
		String[] fruits = {"apple", "banana", "pear", "kiwi"};
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		
		// int value = 0;
		// string в отличие от примитивных типов данных не выделяет память
		// а лишь сосдат ссылку с пустым значением null
		// String text = null;
		
		String[] texts = new String[2];
		System.out.println(texts[0]); // null
		texts[0] = "one"; // выделение памяти
		
	}
}
