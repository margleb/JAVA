import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
	// FileNotFoundException ������ ������ (�������� ��� try/catch)
	public static void main(String[] args) throws FileNotFoundException {
		// ���� � �����
		// String filename = "C:/Users/margleb/Desktop/example.txt";
		String filename = "example.txt";
		// ����� file
		File textFile = new File(filename);
		
		// ��������� ����
		Scanner in = new Scanner(textFile);
		
		// ��������� integer ��������
		int value = in.nextInt();
		System.out.println("Read value: " + value);
		/*
		 * � ������� �� nextInt() ������, 
		 * nextLine() ����������� ��������� ������ (����� ������), 
		 * ��������� ��������� ������ ������ ��� ������� 2
		 */
		in.nextLine();
		
		int count = 2;
		// ���� ���� ��������� ������
		while(in.hasNextLine()) {
			// ����� ������
			String line = in.nextLine();
			// ������� ������
			System.out.println(count + ": " + line);
			count++;
		}
		
		// ��������
		in.close();
	}
	
}
