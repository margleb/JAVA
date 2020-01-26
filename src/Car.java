
public class Car extends Machine {
	
	// переписываем класс из класса Machine
	// @Override проверяет действительно ли класс перезаписан
	@Override
	public void start() {
		System.out.println("Car started");
	}	
	
	
	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	}
	
	// приватные свой-ва из род класса не видны
	// public void showInfo() {
		// System.out.println("Car name: " + name);
	// }

}
