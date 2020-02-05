
public class Bycicle {
	int cadence, gear, speed;
	
	public Bycicle(int candenceArg, int gearArg, int speedArg) {
		cadence = candenceArg;
		gear = gearArg;
		speed = speedArg;
	}

	void setCadence(int newValue) {
		cadence = newValue;
	}

	void setGear(int newValue) {
		gear = newValue;
	}
	
	void speedUp(int increment) {
		speed += increment;
	}
	
	void applyBrake(int decrement) {
		speed -= decrement;
	}

}
