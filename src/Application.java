/*
 * ���� ������������ - ����������� ������ � ������� ������ � ����� ������� � ����� �������� (������)
 * �������� - ������� ���� ������ � ������ (private) � �������������� ������ (�������) ��� ���������� ����� ������� 
 */
class Plant {
	
	public static final int ID = 7;
	private String name;

	private int calculateGrowthForecast() {
		return 9;
	}	
	
	// ������ ��� ���������� �������, ��������� ���� ������
	public String getData() {
		String data = "some stuff" + calculateGrowthForecast();
		return data;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
}

public class Application {
	
	public static void main(String[] args) {

	}
	
}
