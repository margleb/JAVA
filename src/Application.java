import world.Plant;

/*
 * public - доступ абсолютно везде
 * private - доступ только в текущем классе
 * protected - доступ в текущем классе, в дочерниx и текущем пакете
 * без модификатора -- только в текущем пакете
 */

public class Application {
	public static void main(String[] args) {
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		
		System.out.println(plant.ID);
		
		// Won't work -- type is private
		// System.out.println(plant.type);
		
		// size is protected; App is not in the same package as Plant
		// Won't work
		// System.out.println(plant.size);
		
		// Won't work; App and Plant in different packages, 
		// height has package level visibility
		// System.out.println(plant.height);
	}
	
}
 