public class Application {
	public static void main(String[] args) {

		int myInt = 15;
		if(myInt < 10) {
			System.out.println("Yes, it's true!");
		} else if(myInt > 20) {
			System.out.println("Yes, it's false!");
		} else {
			System.out.println("Non of the above.");
		}

		int loop = 0;
		while (loop < 5) {
			System.out.println("Looping:" + loop);
			if (loop == 5) {
				break;
			}
			loop++;
			System.out.println("Running");
		}

	}
}
