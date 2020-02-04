/*
 * 1. Создаем тип данных enum с константами MALE, FEMALE
 * 
 * 2. Создаем поля индефицирующие пользователя
 *    - имя
 *    - дата рождения (класс LocalDate)
 *    - пол
 *    - email
 * 
 * 3. Cоздаем конструктор
 *    - к аргументам добавляем arg, чтобы избежать теней (shadowing)
 * 
 * 4. Создаем методы get для каждого поля
 *    - создаем getAge() (возраст), вместо date;
 *      - используем метод until (высчитывает период от текущей даты до сегодняшней)
 *        - метод dateNow класса IsoChronology
 *      - для конвертации Period в int, используем метод getYears(), получаем кол-во лет данного периода
 *   
 * 5. Создаем метод, выводящий в консоль имя + возраст
 * 
 * 6. Создаем cтатический метод, сравнивающий возраста двух пользователей
 *    - используем compareTo() класса LocalDate
 *   
 * 7. Создаем метод, создающий список пользователй соц сети
 *    - используем коллекцию List для обьектов класса Person
 *    - при добавлении даты используем метод date IsoChronology класса т
 *        
 */

import java.util.List;
import java.util.ArrayList;
import java.time.chrono.IsoChronology;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Period;

public class Person {
	public enum Sex {
		MALE, FEMALE
	}

	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;

	Person(String nameArg, LocalDate birthdayArg, Sex genderArg, String emailArg) {
		name = nameArg;
		birthday = birthdayArg;
		gender = genderArg;
		emailAddress = emailArg;
	}

	public int getAge() {
		return birthday.until(IsoChronology.INSTANCE.dateNow()).getYears();
	}

	public void printPerson() {
		System.out.println(name + ", " + this.getAge());
	}

	public Sex getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public static int compareByAge(Person a, Person b) {
		return a.birthday.compareTo(b.birthday);
	}

	public static List<Person> createRoster() {

		List<Person> roster = new ArrayList<>();
		roster.add(new Person("Fred", IsoChronology.INSTANCE.date(1980, 6, 20), Person.Sex.MALE, "fred@example.com"));
		roster.add(new Person("Jane", IsoChronology.INSTANCE.date(1990, 7, 15), Person.Sex.FEMALE, "jane@example.com"));
		roster.add(
				new Person("George", IsoChronology.INSTANCE.date(1991, 8, 13), Person.Sex.MALE, "george@example.com"));
		roster.add(new Person("Bob", IsoChronology.INSTANCE.date(2000, 9, 12), Person.Sex.MALE, "bob@example.com"));

		return roster;
	}
}