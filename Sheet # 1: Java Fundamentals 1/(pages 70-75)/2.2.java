public class Main {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print(" Enter the radius and length of a cylinder: ");
		float radius = input.nextFloat();
		float length = input.nextFloat();
		double area = radius * radius * Math.PI;

		System.out.println("The area is " + area);
		System.out.println("The volume is " + area * length);
	}
}
