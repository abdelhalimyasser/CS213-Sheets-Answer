public class Rectangle extends GeometricObject {
	private double length;
	private double width;

	public Rectangle() {
		super();
	}

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return this.length;
	}

	public double getWidth() {
		return this.width;
	}

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return 2 * (length + width);
	}

	@Override
	public String toString() {
		return "Rectangle with length " + this.length + ", width " + this.width + ", area " + this.getArea() + ", and Perimeter " + this.getPerimeter();
	}
}
