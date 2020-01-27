import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
	// FileNotFoundException кидает ошибку (работает как try/catch)
	public static void main(String[] args) throws FileNotFoundException {
		// путь к файлу
		// String filename = "C:/Users/margleb/Desktop/example.txt";
		String filename = "example.txt";
		// класс file
		File textFile = new File(filename);
		
		// сканируем файл
		Scanner in = new Scanner(textFile);
		
		// прочитать integer значение
		int value = in.nextInt();
		System.out.println("Read value: " + value);
		/*
		 * В отличии от nextInt() метода, 
		 * nextLine() прочитывает невидимый символ (новая строка), 
		 * исправляя появление пустой строки под номером 2
		 */
		in.nextLine();
		
		int count = 2;
		// пока есть следующая строка
		while(in.hasNextLine()) {
			// берем строку
			String line = in.nextLine();
			// выводим строку
			System.out.println(count + ": " + line);
			count++;
		}
		
		// закрытие
		in.close();
	}
	
}
