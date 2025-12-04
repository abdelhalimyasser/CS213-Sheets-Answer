public class Circle extends GeometricObject {
	private double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle with radius " + this.radius + ", area " + this.getArea() + ", and Perimeter " + this.getPerimeter();
	}

	public int compareTo(Circle other) {
		if (this.radius > other.radius) return 1;
		else if (this.radius < other.radius) return -1;
		else return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Circle)) return false;
		Circle other = (Circle) obj;
		return this.radius == other.radius;
	}

}
