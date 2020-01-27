import java.util.ArrayList;


class Animal {
	
}

public class Application {
	
	public static void main(String[] args) {
		
		///////////////// Before Java 5 ///////////////
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		// get ��������� ������, ������� ��� ���������� downcasting � c�����
		String fruit = (String) list.get(1);
		
		System.out.println(fruit);
		
		///////////// Modern style //////////////////
		
		// ��������� � ���������� ������� ��� ������� ����� �� �����
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("�at");
		strings.add("dog");
		strings.add("alligator");
		
		String animal = strings.get(1);
		System.out.println(animal);
		
		//////////// There can be more than one type argument //////////////
		// HashMap<Integer, String> map = new HashMap<Integer,String>();
		
	
		////////// Java 7 style //////////////////////
		
		ArrayList<Animal> someList = new ArrayList<>();
	
	}
	
}
