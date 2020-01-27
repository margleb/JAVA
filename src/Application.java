class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}

public class Application {
	public static void main(String[] args) {
		
		// возращет обьект с хешкодом
		System.out.println(new Object());

		Person person1 = new Person(5, "Bob");
		Person person2 = new Person(5, "Bob");
		
		// person2 = person1;

		// вернет false, так как это 2 разных обьекта
		// даже если они содержат одинаковую информацию
		// System.out.println(person2 == person1);
		
		// сверяет равны ли два обьекта по своим данным
		System.out.println(person1.equals(person2));
		
		Double value1 = 7.2;
		Double value2 = 7.2;
		System.out.println(value1 == value2);
		
		Integer number1 = 6;
		Integer number2 = 6;
		System.out.println(number1 == number2);
		
		// при наличии одинаково текста, 
		// JAVA оптимизирует и помещает его в один обьект
		String text1 = "Hello";
		String text2 = "Hellodsda".substring(0, 5);
		System.out.println(text2);
		
		// false так как указывает на 2 разных обьекта
		System.out.println(text1 == text2);
				
	}
}
