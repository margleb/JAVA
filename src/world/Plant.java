package world;

public class Plant {
	// Bad practice
	public String name;
	// Acceptable practice --- it's final
	public final static int ID = 8;
	// ����� ������ ������ ��� ����� ������ � ����������
	protected String size;
	
	int height;
	
	// ������ ������ � ���� ������
	private String type;
	
	
	public Plant() {
		name = "Freddy";
		type = "plant";
		size = "medium";
		height = 8;
	}
}
