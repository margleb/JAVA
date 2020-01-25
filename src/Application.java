import java.util.Scanner;

public class Application {
	public static void main(String[] args) {	
		// Создаем обьект scanner
		Scanner input = new Scanner(System.in);
		
		// Выводим сообщение в консоль
		System.out.println("Eneter a floating point value: ");
		
		// Ожидаем ввод пользователем текста
		// String line = input.nextLine();
		// int value = input.nextInt();
		double value = input.nextDouble();
		
		// Выводим введенное сообщение
		System.out.println("You entered: " + value);
	}
}
