import java.util.HashMap;
import java.util.Map;

public class Application {
	public static void main(String[] args) {
		
		// HahsMap НЕ поддерживает порядок элементов (иногда выводится рандомно)
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(6, "Six");
		// перезапись дубля
		// map.put(6, "Hello");
		map.put(4, "Four");
		map.put(2, "Two");
		
		String text = map.get(6);
		
		// System.out.println(text);
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			// получить ключ
			int key = entry.getKey();
			// получить значение
			String value = entry.getValue();
			System.out.println(key + ": " + value);
			
		}
		
	}	
}
