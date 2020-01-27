class Machine {
	public void start() {
		System.out.println("Machine started");
	}
}

class Camera extends Machine {
	public void start() {
		System.out.println("Camera started");
	}
	
	public void snap() {
		System.out.println("Photo taken");
	}
}

public class Application {
	
	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		// machine1.start();
		// camera1.start();
		// camera1.snap();
		
		/*
		 *  Тип переменной определяет какой метод я могу вызвать, 
		 *  а переменная содержащая в себе другой тип обьекта,
		 *  определяет какие фактически методы будут вызываться 
		 *  при вызове конкретного метода
		 */
		
		// Upcasting
		Machine machine2 = camera1;
		// вызывается метод из класса camera
		machine2.start();
		// error: machine2.snap();
		
		// Downcasting
		Machine machine3 = new Camera();
		Camera camera2 = (Camera) machine3;
		camera2.start();
		// теперь метод snap() доступен
		camera2.snap();
		
		// Doesn't work -- runtime error
		Machine machine4 = new Machine();
		// Camera camera3 = (Camera)machine4;
		// camera3.start();
		// camera3.snap();
	}
	
}
