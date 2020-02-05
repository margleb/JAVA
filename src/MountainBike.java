
public class MountainBike extends Bycicle {
	int seatHeight;
	
	public MountainBike(int candenceArg, int gearArg, int speedArg, int seatHeightArg) {
		// конструктор cупер класса
		super(candenceArg, gearArg, speedArg);
		seatHeight = seatHeightArg;
	}
	
	void setSeatHeight(int newValue) {
		seatHeight = newValue;
	}
	
}
