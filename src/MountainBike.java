
public class MountainBike extends Bycicle {
	int seatHeight;
	
	public MountainBike(int candenceArg, int gearArg, int speedArg, int seatHeightArg) {
		// ����������� c���� ������
		super(candenceArg, gearArg, speedArg);
		seatHeight = seatHeightArg;
	}
	
	void setSeatHeight(int newValue) {
		seatHeight = newValue;
	}
	
}
