
public class Car extends Machine {
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Starting car!");
	}

	@Override
	public void doStuff() {
		System.out.println("Do stuff in car!");
		
	}

	@Override
	public void shutdown() {
		System.out.println("Shutdown car.");
		
	}
}
