import java.io.Serializable;

// добавляем сериализацию
public class Person implements Serializable {
	
	// ID сериализации/десериализации
	private static final long serialVersionUID = 4801633306273802062L;
	
	// transient позволяет не сериализировать
	private transient int id;
	private String name;
	
	// статические свойства не сериализуются
	private static int count;
	
	public Person() {
		System.out.println("Default Constructor");
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		
		System.out.println("Two-argument constructor");
	}
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "] Count is " + count;
	}

}
