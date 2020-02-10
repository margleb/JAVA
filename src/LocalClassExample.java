
public class LocalClassExample {

	static String regularExpression = "[^0-9]";

	static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {
		// допускается без final в JDK 8 и более ранних версиях
		int numberLength = 10;
		class PhoneNumber {
			String formattedPhoneNumber = null;

			PhoneNumber(String phoneNumber) {
				// удаление всех символов с номера телефона, кроме цифр от 0 до 9.
				String currentNumber = phoneNumber.replaceAll(regularExpression, "");
				// провкра на содержание 10 цифр в номере телефонв
				if (currentNumber.length() == numberLength) {
					formattedPhoneNumber = currentNumber;
				} else {
					formattedPhoneNumber = null;
				}
			}

			String getNumber() {
				return formattedPhoneNumber;
			}
			// в Java SE 8 локальный класс может полуючать доступ до параметров метода
			// void printOriginalNumbers() {
			// System.out.println(phoneNumber1 + ", " + phoneNumber2);
			// }
		}

		PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
		PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

		// в Java SE 8 локальный класс может полуючать доступ до параметров метода
		// myNumber1.printOriginalNumbers();

		if (myNumber1.getNumber() == null) {
			System.out.println("Первый номер не определен");
		} else {
			System.out.println("Первый номер " + myNumber1.getNumber());
		}

		if (myNumber2.getNumber() == null) {
			System.out.println("Второй номер не определен");
		} else {
			System.out.println("Второй номер " + myNumber1.getNumber());
		}

	}

	public static void main(String[] args) {
		validatePhoneNumber("123-456-7890", "456-7890");
	}

}
