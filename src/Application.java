
public class Application {

	public static void main(String[] args) {
		// true/false
		boolean isActive = false;
		// целое число, занимает 1 байт
		byte myByte = 127;
		// целое число, занимает 2 байта
		short myShort = -32768;
		// целое число, занимает 4 байта
		int myNumber = 2147483647;
		// целое число, занимает 8 байт
		long myLong = 5;
		// число с плавающей точкой, занимает 8 байт
		double myDouble = 8.5;
		// число с плавающей точкой занимает 4 байта
		float myFloat = 8.5F;
		// хранит одиночный символ в кодировке UTF-16 и занимает 2 байта
		char myChar = 'g';
		
		System.out.println(isActive);
		System.out.println(myByte);
		System.out.println(myShort);
		System.out.println(myNumber);
		System.out.println(myLong);
		System.out.println(myDouble);
		System.out.println(myFloat);
		System.out.println(myChar);
		
	}

}
