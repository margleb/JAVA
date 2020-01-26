class Thing {
	
	// final обозначение константы
	public final static int LUCKY_NUMBER = 7; 
	
	public String name;
	public static String description;
	
	// статические свойства принадлежат классу а не обьекту
	public static int count = 0;
	
	public int id;
	
	// конструктор увеличивает count на одну еденицу
	public Thing() {	
		id = count;
		count++;
	}
	
	public void showName() {
		// методы экземпл€ра имеют доступ до статических свойств
		System.out.println("Object id: " + id + ", " + description + ": " + name);
	}
	
	public static void showInfo() {
		// статические методы имеют доступ до статических cвойств
		System.out.println(description);
		// статические методы на могут иметь доступа до переменных экземпл€ра
		// System.out.println(name);
	}
}

public class Application {
	public static void main(String[] args) {
		
		// статические свой-ва не требуют создани€ экз. класса
		Thing.description = "I am a thing";
		// System.out.println(Thing.description);
		
		Thing.showInfo();
		
		
		System.out.println("Before creating objects, count is: " + Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		System.out.println("After creating objects, count is: " + Thing.count);
		
		Thing thing3 = new Thing();
		Thing thing4 = new Thing();
		thing1.name = "Bob";
		thing2.name = "Sue";
		// System.out.println(thing1.name);
		// System.out.println(thing2.name);
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		
		// константы невозможно измен€ть!
		// Math.PI = 3;
		
		// константы в JAVA отображаютс€ заглавными буквами
		System.out.println(Thing.LUCKY_NUMBER);
		
	}
}
