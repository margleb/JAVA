/*
 * 1. Импортируем список(roster) в метод main
 * 2. Циклом for перебираем и выводим имя и возраст каждого пользователя
 * 
 * Расматриваем разные подходы:
 * 1. Создаем метод printPersonsOlderThan(), который находит пользователя по одному критерию (возрасту)
 * 2. Cоздаем метод printPersonsWithinAgeRange(), который находит пользователей в диапазоне возрастов
 * 3. Cоздаем локальный класс CheckPersonEligibleForSelectiveService в методе main c доп. параметром пола
 *    - создаем интерфейс CheckPerson с методом test
 *    - cоздаем метод printPersons проверяющий по критериям
 * 4. Переписываем с учетом ананимного класса
 * 5. Указываем критерии поиска с помочью лямбда выражения
 *    Поскольку функциональный интерфейс содержит только один абстрактный метод, 
 *    я могу опустить имя этого метода при его реализации.
 * 6. Используем predicate интерфейс за место checkPerson интерфейса
 * 7. Пример 1:
 * 	  - Заменяем printPerson() интерфейсом Consumer, называем новую функцию processPersons()
 *    	 - передаем Consumer в качестве аргумента
 *    Пример 2:
 *    - Передаем метод mapper класса Function в качестве аргумента (тип string, person)
 *    - используем apply метод, записываем его в data (email), выводим лямбда функцией
 *    
 * 8. Cоздаем универсальную версию (generic version), которая может принимать в качестве параметра любой тип данных
 *    - Person заменяем на X, а String на y
 * 	  - Вместо List используем метод Iterable
 *
 * 9. Используем агрегатные операции (aggregate Operations) java
 *   roster - коллекция обьектов
 *   stream - получаем исходники обьектов
 *   filter - фильтр объектов (Predicate)
 *   map(p -> p.getEmailAddress()) - свойство email (Function)
 *  .forEach() - выполнить действия для кажлого элемента map
 *
 *  T - тип входа в функцию R - тип результата функции
 *  Predicate<T> -  Функциональный интерфейс для лямбда-выражений. Представляет предикат (булевозначная функция) одного аргумента (метод test).
 *  Consumer<T> -   Функциональный интерфейс для лямбда-выражений. Представляет операцию, которая принимает один входной аргумент и не возвращает результата (метод accept).
 *  Function<T,R> - Функциональный интерфейс для лямбда-выражений. Представляет функцию, которая принимает один аргумент и выдает результат (метод apply).
 */

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.Comparator;
import java.util.function.Predicate;
import java.lang.Iterable;
import java.time.chrono.IsoChronology;

public class Application {

	interface CheckPerson {
		boolean test(Person p);
	}

	// Approach 1: Create Methods that Search for Persons that Match One
	// Characteristic

	public static void printPersonsOlderThan(List<Person> roster, int age) {
		for (Person p : roster) {
			if (p.getAge() >= age) {
				p.printPerson();
			}
		}
	}

	// Approach 2: Create More Generalized Search Methods

	public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
		for (Person p : roster) {
			if (low <= p.getAge() && p.getAge() < high) {
				p.printPerson();
			}
		}
	}

	// Approach 3: Specify Search Criteria Code in a Local Class
	// Approach 4: Specify Search Criteria Code in an Anonymous Class
	// Approach 5: Specify Search Criteria Code with a Lambda Expression

	public static void printPersons(List<Person> roster, CheckPerson tester) {
		for (Person p : roster) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}
	}

	// Approach 6: Use Standard Functional Interfaces with Lambda Expressions

	public static void printPersonsWithPredicate(List<Person> roster, Predicate<Person> tester) {
		for (Person p : roster) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}
	}

	// Approach 7: Use Lambda Expressions Throughout Your Application

	public static void processPersons(List<Person> roster, Predicate<Person> tester, Consumer<Person> block) {
		for (Person p : roster) {
			if (tester.test(p)) {
				block.accept(p);
			}
		}
	}

	// Approach 7, second example

	public static void processPersonsWithFunction(List<Person> roster, Predicate<Person> tester,
			Function<Person, String> mapper, Consumer<String> block) {
		for (Person p : roster) {
			if (tester.test(p)) {
				String data = mapper.apply(p);
				block.accept(data);
			}
		}
	}

	// Approach 8: Use Generics More Extensively

	public static <X, Y> void processElements(Iterable<X> source, Predicate<X> tester, Function<X, Y> mapper,
			Consumer<Y> block) {
		for (X p : source) {
			if (tester.test(p)) {
				Y data = mapper.apply(p);
				block.accept(data);
			}
		}
	}

	public static void main(String... args) {

		List<Person> roster = Person.createRoster();

		for (Person p : roster) {
			p.printPerson();
		}

		// Approach 1: Create Methods that Search for Persons that Match One
		// Characteristic

		System.out.println("Persons older than 20:");
		printPersonsOlderThan(roster, 20);
		System.out.println();

		// Approach 2: Create More Generalized Search Methods

		System.out.println("Persons between the ages of 14 and 30:");
		printPersonsWithinAgeRange(roster, 14, 30);
		System.out.println();

		// Approach 3: Specify Search Criteria Code in a Local Class

		System.out.println("Persons who are eligible for Selective Service:");

		class CheckPersonEligibleForSelectiveService implements CheckPerson {
			public boolean test(Person p) {
				return p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
			}
		}

		printPersons(roster, new CheckPersonEligibleForSelectiveService());

		System.out.println();

		// Approach 4: Specify Search Criteria Code in an Anonymous Class

		System.out.println("Persons who are eligible for Selective Service " + "(anonymous class):");

		printPersons(roster, new CheckPerson() {
			public boolean test(Person p) {
				return p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
			}
		});

		System.out.println();

		// Approach 5: Specify Search Criteria Code with a Lambda Expression

		System.out.println("Persons who are eligible for Selective Service " + "(lambda expression):");

		printPersons(roster, (Person p) -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);

		System.out.println();

		// Approach 6: Use Standard Functional Interfaces with Lambda
		// Expressions

		System.out.println("Persons who are eligible for Selective Service " + "(with Predicate parameter):");

		printPersonsWithPredicate(roster,
				p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);

		System.out.println();

		// Approach 7: Use Lamba Expressions Throughout Your Application

		System.out.println(
				"Persons who are eligible for Selective Service " + "(with Predicate and Consumer parameters):");

		processPersons(roster, p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25,
				p -> p.printPerson());

		System.out.println();

		// Approach 7, second example

		System.out.println("Persons who are eligible for Selective Service "
				+ "(with Predicate, Function, and Consumer parameters):");

		processPersonsWithFunction(roster,
				p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25, p -> p.getEmailAddress(),
				email -> System.out.println(email));

		System.out.println();

		// Approach 8: Use Generics More Extensively

		System.out.println("Persons who are eligible for Selective Service " + "(generic version):");

		processElements(roster, p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25,
				p -> p.getEmailAddress(), email -> System.out.println(email));

		System.out.println();

		// Approach 9: Use Bulk Data Operations That Accept Lambda Expressions
		// as Parameters

		System.out.println("Persons who are eligible for Selective Service " + "(with bulk data operations):");

		roster.stream().filter(p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25)
				.map(p -> p.getEmailAddress()).forEach(email -> System.out.println(email));
	}

}
