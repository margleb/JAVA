public class Application {
	
	public static void main(String[] args) {
		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 23355;
		
		float floatValue = 8834.8f;
		// преобразование double во float
		float floatValue2 = (float) 99.3;
		double doubleValue = 32.4;
		
		// System.out.println(Byte.MAX_VALUE);
		// System.out.println(Integer.MAX_VALUE);
		
		// Используем кастинг для конвертации одного числа в другое
		intValue = (int) longValue;
		System.out.println(intValue);
		
		// Нет необходимости указывать, так как значение не урезается
		// а лишь преобразуется в число с плавающей точкой
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		// Требуется указание кастинга так как урезаются значения 
		// после запятой
		intValue = (int) floatValue;
		System.out.println(intValue);
		
		// преобразует в -128, так как макс. число 127
		byteValue = (byte)128;
		System.out.println(byteValue);
		
	}
	
}
