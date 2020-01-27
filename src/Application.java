public class Application {
	
	public static void main(String[] args) {
		Camera cam1 = new Camera();
		cam1.setId(5);
		
		Car car1 = new Car();
		car1.setId(4);
		
		сar1.run();
		// Невозможно инициализировать, так как Machine это абстрактный класс
		// Machine machine1 = new Machine();
	}
	
}
