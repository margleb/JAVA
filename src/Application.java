/*
 * RuntimeException - ��� ����� ���������� ������� �������� �������� 
 * ��� � ���� ������� ������ �� ���� ������ � �� ����� ����
 * ��������. ������� �� �� ����� �������� � ������������ try/catch ��� trow.
 */
public class Application {
	public static void main(String[] args) {
		
		/* ������� 1 */
		// int value = 7;
		// value = value/0;
		
		/* ������� 2 */
		// String text = null;
		// System.out.println(text.length());
		
		/* ������� 3 */
		String[] texts = {"one", "two", "three"};
		
		try {
			System.out.println(texts[3]);	
		} catch (RuntimeException e) {
			System.out.println(e.toString());
		}
		
	}
}
