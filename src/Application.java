import java.util.Scanner;

public class Application {
	public static void main(String[] args) {	
		// ������� ������ scanner
		Scanner input = new Scanner(System.in);
		
		// ������� ��������� � �������
		System.out.println("Eneter a floating point value: ");
		
		// ������� ���� ������������� ������
		// String line = input.nextLine();
		// int value = input.nextInt();
		double value = input.nextDouble();
		
		// ������� ��������� ���������
		System.out.println("You entered: " + value);
	}
}
