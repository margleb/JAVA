package world;

public class Oak extends Plant {
	public Oak() {
		
		// Won't work -- type is private
		// type = "tree";
		
		// This works --size is protected, Oak is subclass of plant.
		this.size = "large";
		// No access specifier; works becouse Oak and Plant in the same package
		this.height = 10;
	}
}
