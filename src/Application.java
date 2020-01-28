public class Application {

	// public static final int DOG = 0;
	// public static final int CAT = 1;
	// public static final int MOUSE = 2;

	public static void main(String[] args) {

		Animal animal = Animal.DOG;

		switch (animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			break;
		}
		
		// выводит как строку если у константы не передано имя
		// выводит значение метода toString()
		System.out.println(Animal.DOG);
		// выводит название константы как строку
		System.out.println("Enum name as a string " + Animal.DOG.name());
		// выводит класс Animal
		System.out.println(Animal.DOG.getClass());
		// instanceof оператор проверят является ли экземпляром класса Animal
		System.out.println(Animal.DOG instanceof Enum);
		// получение имени константы MOUSE из Enum
		System.out.println(Animal.MOUSE.getName());
		// получаем значение константы CAT
		Animal animal2 = Animal.valueOf("CAT");
		System.out.println(animal2);
		
	}
}
