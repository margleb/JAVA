class Machine {
	public void start() {
		System.out.println("Starting machine...");
	}
}

interface Plant {
	public void grow();
}

public class Application {

	public static void main(String[] args) {
		// переписанный класс является потом родительского
		Machine machine1 = new Machine() {
			@Override public void start() {
				System.out.println("Camera snapping...");
			}
		};
		machine1.start();
		
		// внедрение метода через интерфейс
		Plant plant1 = new Plant() {
			public void grow() {
				System.out.println("Plant growing");	
			}
		};
		
		plant1.grow();
	}
}
