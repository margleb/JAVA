public class Application {
	public static void main(String[] args) {
		Robot robot = new Robot(7);
		robot.start();
		
		// ��������� ������� �� ����������� ������ ���� �� public
		// Robot.Brain brain = robot.new Brain();
		// brain.think();
		
		// ��������� ������� �� ����������� ������������ ������
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
		
	}
}
