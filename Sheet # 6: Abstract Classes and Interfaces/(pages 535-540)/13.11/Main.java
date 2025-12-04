public class Main {
	public static void main(String[] args) {
		Octagon o1 = new Octagon(5);

		System.out.println("Octagon o1: " + o1);
		System.out.println("Area: " + o1.getArea());
		System.out.println("Perimeter: " + o1.getPerimeter());

		Octagon o2 = (Octagon) o1.clone();
		System.out.println("Cloned Octagon o2: " + o2);

		int result = o1.compareTo(o2);
		
		if (result == 0)
			System.out.println("o1 and o2 are equal.");
		else if (result > 0)
			System.out.println("o1 is larger than o2.");
		else
			System.out.println("o1 is smaller than o2.");
	}
}
