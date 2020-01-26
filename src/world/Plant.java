package world;

public class Plant {
	// Bad practice
	public String name;
	// Acceptable practice --- it's final
	public final static int ID = 8;
	// »меет доступ только дл€ этого класса и наследника
	protected String size;
	
	int height;
	
	// ƒоступ только в этом классе
	private String type;
	
	
	public Plant() {
		name = "Freddy";
		type = "plant";
		size = "medium";
		height = 8;
	}
}
