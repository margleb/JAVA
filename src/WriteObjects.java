import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
	public static void main(String[] args) {
		System.out.println("Writting objects...");
		
		Person mike = new Person(543, "Mike");
		Person sue = new Person(543, "Sue");

		System.out.println(mike);
		System.out.println(sue);
		
		Person[] people = {new Person(1, "Sue"), new Person(99, "Mike"), new Person(7, "Bob")};
		
		// преобазуем обьект в массив
		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
		
		try(FileOutputStream fs = new FileOutputStream("people.bin")) {
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			// cериализуем обьект
			os.writeObject(people);
			
			// сериалиуем массив
			os.writeObject(peopleList);
			
			// сериализуем длину элементов обьекта
			os.writeInt(peopleList.size());
			
			for(Person person: peopleList) {
				os.writeObject(person);
			}
		
			
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
