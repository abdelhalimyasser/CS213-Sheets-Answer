public class Main
{
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);

		System.out.printf("Rectangle1\nThe width: %f\nThe height: %f\nThe area: %f\nThe perimeter: %f\n",
		                  rectangle1.width,
		                  rectangle1.height,
		                  rectangle1.getArea(),
		                  rectangle1.getPerimeter());

		System.out.println("----------------------------");

		System.out.printf("Rectangle2\nThe width: %f\nThe height: %f\nThe area: %f\nThe perimeter: %f\n",
		                  rectangle2.width,
		                  rectangle2.height,
		                  rectangle2.getArea(),
		                  rectangle2.getPerimeter());
	}
}


class Rectangle {
	// default variables
	public double width;
	public double height;

	// the no-args constructor
	public Rectangle() {
		this.width = 1;
		this.height = 1;
	}

	// the specified valued constructor
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// the getArea to calculate the area
	public double getArea() {
		return width * height;
	}

	// the getPerimeter to calculate the perimeter
	public double getPerimeter() {
		return 2 * (width + height);
	}
}
