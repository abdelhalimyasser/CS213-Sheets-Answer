public class Main
{
	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(3);
		
		Rectangle r1 = new Rectangle(4, 5);
		Rectangle r2 = new Rectangle(2, 10);

		System.out.println("Larger circle: " + GeometricObject.max(c1, c2));
		System.out.println("Larger rectangle: " + GeometricObject.max(r1, r2));
	}
}
