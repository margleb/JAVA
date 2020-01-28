import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		/*
		 * ArrayLists manage arrays internally.
		 * [0][1][2][4][5]...
		 * Используется, когда нужно удалить элемент в конце списка
		 */
		List<Integer> arrayList = new ArrayList<Integer>();
		/*
		 * LinkedLists consists of elements where each elements
		 * has a reference to the previous and next element
		 * [0]->[1]->[2]...
		 * <- <-
		 * Используется, когда нужно удалить элемент в середине или начале списка
		 */
		List<Integer> linkedList = new LinkedList<Integer>();
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}

	private static void doTimings(String type, List<Integer> list) {
		
		for(int i=0; i<1E5; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		/*
		// Add items at end of list
		for(int i=0; i<1E5; i++) {
			list.add(i);
		}
		*/
		
		/*
		// Add items elsewere in list
		for(int i=0; i<1E5; i++) {
			list.add(0, i);
		}
		*/
		
		for(int i=0; i<1E5; i++) {
			list.add(list.size() - 100, i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (end - start) + " ms for " + type);
	}
	
}
