import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {

		// Hashset не сохран€ет пор€док
		// Set<String> set1 = new HashSet<String>();

		// LinkedHashSet сохран€ет пор€док добавлени€ элементов
		// Set<String> set1 = new LinkedHashSet<String>();

		// TreeSet устанавливает элементы в натуральном пор€дке (1,2,3.., a,b,c...)
		Set<String> set1 = new TreeSet<String>();

		if (set1.isEmpty()) {
			System.out.println("Set is empty at start");
		}

		System.out.println();

		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");

		if (set1.isEmpty()) {
			System.out.println("Set is empty after adding");
		}

		// ƒобаление дубликатов не учитываетс€
		set1.add("mouse");

		System.out.println(set1);

		///////////// Iteration ///////////////////
		System.out.println();

		for (String element : set1) {
			System.out.println(element);
		}

		///////////// Does set contains a given item? ///////////////////
		System.out.println();

		if (set1.contains("aadvark")) {
			System.out.println("Contains aadvark");
		}

		if (set1.contains("cat")) {
			System.out.println("Contains cat");
		}

		// set2 contains some common elements with set1, and some new
		Set<String> set2 = new TreeSet<String>();
		
		set2.add("dog");
		set2.add("cat");
		set2.add("giraffe");
		set2.add("monkey");
		set2.add("ant");
		
		///////// Intersection ////////////////////////
		System.out.println();
		
		Set<String> intersection = new HashSet<String>(set1);
		
		System.out.println(intersection);
	
		//  оставл€ет только элементы содержащиес€ в set1 и set2
		intersection.retainAll(set2);
		
		System.out.println();
		
		System.out.println(intersection);
		
		///////// Diffrence ////////////////////////
		System.out.println();
		
		Set<String> difference = new HashSet<String>(set2);
		
		// удал€ет элементы содержащиес€ в set1 и set2
		difference.removeAll(set1);
		
		System.out.println(difference);

	}

}
