class Machine {

	private String name;
	private int code;

	// ����������� 1
	public Machine() {
		// ����� �������� �����������
		// ������ ������ ���� �� ������ ������
		this("Arnie", 0);

		System.out.println("Contructor running!");
		// name = "Arnie";
	}

	// ����������� 2
	public Machine(String name) {
		// ����� �������� �����������
		this(name, 0);
		System.out.println("Second Contructor running!");
		this.name = name;
	}

	public Machine(String name, int code) {

		System.out.println("Third constructor running!");
		this.name = name;
		this.code = code;
	}

}

public class Application {
	public static void main(String[] args) {
		// ����� ������� �����������
		Machine machine1 = new Machine();
		// ����� ������� �����������. ������� ���������� � ������������ ���������� � ������� ���
		// Machine machine2 = new Machine("Bertie");
		// ����� �������� �����������
		// Machine machine3 = new Machine("Chalky", 7);
	}
}
