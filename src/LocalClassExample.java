
public class LocalClassExample {

	static String regularExpression = "[^0-9]";

	static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {
		// ����������� ��� final � JDK 8 � ����� ������ �������
		int numberLength = 10;
		class PhoneNumber {
			String formattedPhoneNumber = null;

			PhoneNumber(String phoneNumber) {
				// �������� ���� �������� � ������ ��������, ����� ���� �� 0 �� 9.
				String currentNumber = phoneNumber.replaceAll(regularExpression, "");
				// ������� �� ���������� 10 ���� � ������ ��������
				if (currentNumber.length() == numberLength) {
					formattedPhoneNumber = currentNumber;
				} else {
					formattedPhoneNumber = null;
				}
			}

			String getNumber() {
				return formattedPhoneNumber;
			}
			// � Java SE 8 ��������� ����� ����� ��������� ������ �� ���������� ������
			// void printOriginalNumbers() {
			// System.out.println(phoneNumber1 + ", " + phoneNumber2);
			// }
		}

		PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
		PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

		// � Java SE 8 ��������� ����� ����� ��������� ������ �� ���������� ������
		// myNumber1.printOriginalNumbers();

		if (myNumber1.getNumber() == null) {
			System.out.println("������ ����� �� ���������");
		} else {
			System.out.println("������ ����� " + myNumber1.getNumber());
		}

		if (myNumber2.getNumber() == null) {
			System.out.println("������ ����� �� ���������");
		} else {
			System.out.println("������ ����� " + myNumber1.getNumber());
		}

	}

	public static void main(String[] args) {
		validatePhoneNumber("123-456-7890", "456-7890");
	}

}
