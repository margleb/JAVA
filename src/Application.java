class Machine {

	private String name;
	private int code;

	// конструктор 1
	public Machine() {
		// вызов третьего конструтора
		// всегда должно быть на первой строке
		this("Arnie", 0);

		System.out.println("Contructor running!");
		// name = "Arnie";
	}

	// конструктор 2
	public Machine(String name) {
		// вызов третьего конструтора
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
		// вызов первого конструтора
		Machine machine1 = new Machine();
		// вызов второго конструтора. Находит конструтор с передаваемым аргументом и вызвает его
		// Machine machine2 = new Machine("Bertie");
		// вызов третьего конструтора
		// Machine machine3 = new Machine("Chalky", 7);
	}
}
