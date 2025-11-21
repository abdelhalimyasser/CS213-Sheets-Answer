public class Main
{
	public static void main(String[] args) {
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
		MyRectangle2D r2 = new MyRectangle2D(4, 5, 10.5, 3.2);
		MyRectangle2D r3 = new MyRectangle2D(3, 3, 2.3, 1.5);

		System.out.println("Area of r1: " + r1.getArea());
		System.out.println("Perimeter of r1: " + r1.getPerimeter());

		System.out.println("r1 contains point (3,3)? " + r1.contains(3, 3));
		System.out.println("r1 contains r2? " + r1.contains(r2));
		System.out.println("r1 overlaps r2? " + r1.overlaps(r2));
		System.out.println("r1 contains r3? " + r1.contains(r3));
		System.out.println("r1 overlaps r3? " + r1.overlaps(r3));
	}
}

class MyRectangle2D {
	private double x;
	private double y;
	private double width;
	private double height;

	// No-arg constructor
	public MyRectangle2D() {
		this(0, 0, 1, 1);
	}

	// Constructor
	public MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// Getters and setters
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	// Area
	public double getArea() {
		return width * height;
	}

	// Perimeter
	public double getPerimeter() {
		return 2 * (width + height);
	}

	// Check if a points is inside the rectangle
	public boolean contains(double px, double py) {
		return (px >= x - width / 2 && px <= x + width / 2) &&
		       (py >= y - height / 2 && py <= y + height / 2);
	}

	// Check if another rectangle is completely inside this rectangle
	public boolean contains(MyRectangle2D r) {
		return (r.getX() - r.getWidth() / 2 >= x - width / 2) &&
		       (r.getX() + r.getWidth() / 2 <= x + width / 2) &&
		       (r.getY() - r.getHeight() / 2 >= y - height / 2) &&
		       (r.getY() + r.getHeight() / 2 <= y + height / 2);
	}

	// Check if another rectangle overlaps with this rectangle
	public boolean overlaps(MyRectangle2D r) {
		return !(r.getX() + r.getWidth() / 2 < x - width / 2 ||
		         r.getX() - r.getWidth() / 2 > x + width / 2 ||
		         r.getY() + r.getHeight() / 2 < y - height / 2 ||
		         r.getY() - r.getHeight() / 2 > y + height / 2);
	}
}
