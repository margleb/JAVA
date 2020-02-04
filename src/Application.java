
/*
 * 1. Конвертируем roster в массив
 *    - используем метод toArray
 *    - в качестве аргумента передаем экз. класса с размером элементов (size() метод)
 * 
 * 2. Создаем класс сравнивующий даты рождения 2ух пользователей ( внедряем интерфейс comparator)
 *    - cоздаем int метод compare (интерфейса comparator), с двумя обьектами типа Person
 *    - указываем у метода public
 * 
 * 3. Сортируем список без ссылки на на метод (Arrays.sort)
 * 4. Используем внутреннию функцию с лямбда выражением
 * 
 * 5. Пробуем использовать ссылку (::) на метод в классе Person
 * 
 * 6. Пробуем использовать ссылку (::) на конкретный обьект
 *    - создаем класс с 2мя методами (сравнивание по имени и возрасту)
 *    - для метода возраст используем getBirthday (так как невозможно вызвать метод из примитива)
 *    - создаем экземпляр класса
 *    - пробуем сортировать по методу обьекта (сравниване по имени)
 * 
 * 7. Ссылка на метод экземпляра произвольного объекта определенного типа
 *    - создаем массив из строк (имена)
 *    - пробуем сортировать cозданный массив указав тип строка и метод compareToIgnoreCase
 *    
 *  String:: compareToIgnorCase - Сравнивает две строки лексикографически, игнорируя различия регистра.
 *  
 * 8. Ссылка на метод экземпляра произвольного объекта определенного типа (пока не стал писать, так как не очень понятен принцип работы)
 * 
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collection;
import java.util.function.Supplier;
import java.util.Set;
import java.util.HashSet;
import java.time.chrono.IsoChronology;

public class Application {

	public static void main(String... args) {

		List<Person> roster = Person.createRoster();

		for (Person p : roster) {
			p.printPerson();
		}

		Person[] rosterAsArray = roster.toArray(new Person[roster.size()]);

		class PersonAgeComparator implements Comparator<Person> {
			public int compare(Person a, Person b) {
				return a.getBirthday().compareTo(b.getBirthday());
			}
		}

		// Without method reference
		Arrays.sort(rosterAsArray, new PersonAgeComparator());

		// With lambda expression
		Arrays.sort(rosterAsArray, (Person a, Person b) -> {
			return a.getBirthday().compareTo(b.getBirthday());
		});

		// With method reference
		Arrays.sort(rosterAsArray, Person::compareByAge);

		// Reference to an instance method of a particular object
		class ComparisonProvider {
			public int compareByName(Person a, Person b) {
				return a.getName().compareTo(b.getName());
			}

			public int compareByAge(Person a, Person b) {
				return a.getBirthday().compareTo(b.getBirthday());
			}
		}
		ComparisonProvider myComparisonProvider = new ComparisonProvider();
		Arrays.sort(rosterAsArray, myComparisonProvider::compareByName);

		// Reference to an instance method
		// of an arbitrary object of a particular type

		String[] stringArray = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };
		Arrays.sort(stringArray, String::compareToIgnoreCase);

	}
}