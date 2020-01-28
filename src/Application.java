
public class Application {
	public static void main(String[] args) {
		
		Application application = new Application();
		
		//==========================================
		int value = 7;
		System.out.println("1. value is: " + value);
		
		application.show(value);
		
		System.out.println("4. value is: " + value);
		//==========================================
		System.out.println();
		
		Person person = new Person("Bob");
		System.out.println("1. Person is: " + person);
		
		application.show(person);
		
		System.out.println("4. Person is: " + person);
		
	}
	
	public void show(int value) {
		System.out.println("2. value is: " + value);
		
		value = 8;
		
		System.out.println("3. value is: " + value);		
	}
	
	// method overloading
	public void show(Person person) {
		System.out.println("2. Person is: " + person);
		
		// person ссылается НА ПЕРВЫЙ person
		// person.setName("Sue");
		
		person = new Person("Mike");
	
		// person ссылается НА ВТОРОЙ person
		person.setName("Sue");
		
		System.out.println("3. Person is: " + person);
	}
}
