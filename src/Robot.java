/*
 * Не статические внутренние классы используются когда необходимо группировать какой либо функционал
 * И вам нужен класс, чтобы иметь доступ к переменным экземпляра вмещающей внешний класс.
 * 
 * Статические внутренние классы используются в основном там, где вы просто хотите нормальный класс, 
 * который не связан с экземплярами окружающего внешнего класса
 */

public class Robot {
	
	private int id;
	
	// внутренний класс
	private class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking.");
		}
	}
	
	public static class Battery {
		public void charge() {
			// статические классы не могут получать доступ до не статических св-в
			// System.out.println("Battery charging..." + id);
			System.out.println("Battery charging...");
		}
	}
	
	public Robot(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Starting robot " + id);
		Brain brain = new Brain();
		brain.think();
		
		final String name = "Robort";
		
		// класс внутри метода
		class Temp {
			public void doSomething() {
				System.out.println("ID is " + id);
				System.out.println("My name is " + name);
			}
		}
		
		Temp temp = new Temp();
		temp.doSomething();
		
	}
}
