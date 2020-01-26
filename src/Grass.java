import world.Plant;

public class Grass extends Plant {
	public Grass() {
		// Wont work --- Grass not in the same package as plant, even though it's a subclass
		// System.out.println(this.height);
	}
}
