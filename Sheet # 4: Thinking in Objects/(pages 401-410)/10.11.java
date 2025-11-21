public class Main
{
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		Circle2D c2 = new Circle2D(4, 5, 10.5);
		Circle2D c3 = new Circle2D(3, 5, 2.3);

		System.out.println("Area of c1: " + c1.getArea());
		System.out.println("Perimeter of c1: " + c1.getPerimeter());

		System.out.println("c1 contains point (3,3)? " + c1.contains(3, 3));
		System.out.println("c1 contains c2? " + c1.contains(c2));
		System.out.println("c1 overlaps c2? " + c1.overlaps(c2));
		System.out.println("c1 contains c3? " + c1.contains(c3));
		System.out.println("c1 overlaps c3? " + c1.overlaps(c3));
	}
}

class Circle2D {
	private double x;
	private double y;
	private double radius;

	// No-arg constructor
	public Circle2D() {
		this(0, 0, 1);
	}

	// Constructor
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	// Getters Methods
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public boolean contains(double px, double py) {
		double distance = Math.sqrt(Math.pow(px - x, 2) + Math.pow(py - y, 2));
		return distance <= radius;
	}

	public boolean contains(Circle2D circle) {
		double distance = Math.sqrt(Math.pow(circle.x - x, 2) + Math.pow(circle.y - y, 2));
		return distance + circle.radius <= this.radius;
	}

	public boolean overlaps(Circle2D circle) {
		double distance = Math.sqrt(Math.pow(circle.x - x, 2) + Math.pow(circle.y - y, 2));
		return distance <= (this.radius + circle.radius) &&
		       distance >= Math.abs(this.radius - circle.radius);
	}
}
