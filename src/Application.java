public class Application {
	
	public static void main(String[] args) {
		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 23355;
		
		float floatValue = 8834.8f;
		// �������������� double �� float
		float floatValue2 = (float) 99.3;
		double doubleValue = 32.4;
		
		// System.out.println(Byte.MAX_VALUE);
		// System.out.println(Integer.MAX_VALUE);
		
		// ���������� ������� ��� ����������� ������ ����� � ������
		intValue = (int) longValue;
		System.out.println(intValue);
		
		// ��� ������������� ���������, ��� ��� �������� �� ���������
		// � ���� ������������� � ����� � ��������� ������
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		// ��������� �������� �������� ��� ��� ��������� �������� 
		// ����� �������
		intValue = (int) floatValue;
		System.out.println(intValue);
		
		// ����������� � -128, ��� ��� ����. ����� 127
		byteValue = (byte)128;
		System.out.println(byteValue);
		
	}
	
}
