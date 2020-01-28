public class Application {
	public static void main(String[] args) {
		Robot robot = new Robot(7);
		robot.start();
		
		// получение доступа до внутреннего класса если он public
		// Robot.Brain brain = robot.new Brain();
		// brain.think();
		
		// получение доступа до внутреннего статического класса
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
		
	}
}
