import java.util.ArrayList;

class Machine {

	public String toString() {
		return "I am a machine";
	}

	public void start() {
		System.out.println("Machine starting.");
	}
}

class Camera extends Machine {

	public String toString() {
		return "I am a �amera";
	}
	
	public void snap() {
		System.out.println("snap!");
	}
	
}

public class Application {

	public static void main(String[] args) {

		ArrayList<Machine> list1 = new ArrayList<Machine>();

		list1.add(new Machine());
		list1.add(new Machine());

		ArrayList<Camera> list2 = new ArrayList<Camera>();

		list2.add(new Camera());
		list2.add(new Camera());
		
		showList2(list2);
		showList(list1);
		showList3(list1);
	}

	// �������������� ���� �������� ��������� � ����������� �����
	// Object - c��������� ����������� �������� � ����� ����� ��������
	// Extends ����� �� �� �������� � �����, ��� ���� ����� ������ Machine
	
	// ����� ���� ����� Machine ��� �������� ������ Machine
	public static void showList(ArrayList<? extends Machine> list) {
		// for (Object value : list) {
		for (Machine value : list) {
			System.out.println(value);
			value.start();
		}	
	}
	
	// ����� ���� ����� Camera ��� ����� ����� Camera
	public static void showList2(ArrayList<? super Camera> list) {
		for (Object value : list) {
			System.out.println(value);
		}	
	}
	
	// ����� ���� ����� �����
	public static void showList3(ArrayList<?> list) {
			for (Object value : list) {
				System.out.println(value);
			}	
	}

}
