/*
 * В большинстве случаев Enum используется для определения констант
 */

public enum Animal {
	CAT("Fergis"), DOG("Fido"), MOUSE("Jerry");
	
	private String name;
	
	Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return "This animal is called: " + name;
	}
	
}
