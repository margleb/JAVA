import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		// LinkedHashMap ��������� ������� ����/�������� � ������� ����������� � Map
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		// ������ �������� � ����������� ������� (1,2,3.., a,b,c...)
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		// ������� ������������ (������ ����� ������ �������)
		testMap(hashMap);
		System.out.println();
		// ������� � ������� ����������
		testMap(linkedHashMap);
		System.out.println();
		// � ����������� �������
		testMap(treeMap);
	}
	
	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(1, "giraffe");
		map.put(0, "swan");
		map.put(15, "bear");
		map.put(6, "snake");
		
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
		
	}
	
}
