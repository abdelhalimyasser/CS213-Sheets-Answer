public class Main
{
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(0, 0);
		MyPoint p2 = new MyPoint(10, 30.5);

		System.out.println("Distance from p1 to p2: " + p1.distance(p2));
		System.out.println("Distance between p1 and p2 (static): " + MyPoint.distance(p1, p2));
	}
}

class MyPoint {
	private double x;
	private double y;

	// No-arg constructor: point (0,0)
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	// Constructor with specified coordinates
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// Getter methods
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	// Distance to another MyPoint
	public double distance(MyPoint p) {
		double dx = this.x - p.x;
		double dy = this.y - p.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	// Distance to specified coordinates
	public double distance(double x, double y) {
		double dx = this.x - x;
		double dy = this.y - y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	// Static method: distance between two MyPoint objects
	public static double distance(MyPoint p1, MyPoint p2) {
		double dx = p1.x - p2.x;
		double dy = p1.y - p2.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
}
