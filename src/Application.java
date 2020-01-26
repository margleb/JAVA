public class Application {
	
	public static void main(String[] args) {
		
		Machine mach1 = new Machine();
		
		mach1.start();
		mach1.stop();
		
		Car car1 = new Car();
		
		// вызываем метод наследуемый из Machine();
		car1.start();
		car1.wipeWindShield();
		
		// метод с приватный св-вом
		// car1.showInfo(); 
		car1.stop();
	}
	
}

