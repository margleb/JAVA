
public class Rectengle {
	public int width = 0;
	public int height = 0;
	public Point origin;

	Rectengle() {
		origin = new Point(0, 0);
	};

	Rectengle(Point p) {
		origin = p;
	};

	Rectengle(int w, int h) {
		origin = new Point(0, 0);
		width = w;
		height = h;
	};

	Rectengle(Point p, int w, int h) {
		origin = p;
		width = w;
		height = h;
	};

	public void move(int x, int y) {
		origin.x = x;
		origin.y = y;
	}
	
	public int getArea() {
		return width * height;
	}

}
