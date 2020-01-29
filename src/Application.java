import java.util.Iterator;
import java.util.LinkedList;

public class Application {
	
	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");
		
		Iterator<String> it = animals.iterator();
		
		// есть ли следующий элемент, и не достигнут ли конец коллекции
		while(it.hasNext()) {
			// возвращает текущий элемент и переходит к следующему
			String value = it.next();
			System.out.println(value);
			// если значение равно cat
			if(value.equals("cat")) {
				it.remove();
			}
			
		}
		
		System.out.println();
		
		/// Modern iteration, post Java 5 and later
		for(String animal:  animals) {
			System.out.println(animal);			
			// animals.remove(2);
		}
		
	}
	
}