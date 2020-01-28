import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {
	public static void main(String[] args) {
		System.out.println("Reading objects...");
		
		try(FileInputStream fi = new FileInputStream("people.bin"); ObjectInputStream os = new ObjectInputStream(fi)) {
			
			// прочитываем массив обьектов из файла
			Person[] people = (Person[]) os.readObject();
			
			// прочитываем массив из файла
			// @SuppressWarnings - убирает предупреждения
			// передаем в casting Person, так как при десериализации теряется тип
			@SuppressWarnings("unchecked")
			ArrayList<Person> peopleList = (ArrayList<Person>)os.readObject();
			
			for(Person person: people) {
				System.out.println(person);
			}
			
			// выводим значения массива из файла
			for(Person person: peopleList) {
				System.out.println(person);
			}
			
			// прочитываем кол-во обьектов в массиве
			int num = os.readInt();
			
			for(int i=0; i<num; i++) {
				// прочитываем каждый обьект
				Person person = (Person) os.readObject();
				System.out.println(person);
			}
			
			// os.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// если класс прочитываемого обьекта не будет найден в программе
			e.printStackTrace();
		};
	}
}
