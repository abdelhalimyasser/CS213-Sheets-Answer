public class Main {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextFloat();
		double gratuityRate = input.nextDouble();
		double gratuity = (gratuityRate / 100) * subtotal;

		System.out.println("The gratuity is $ " + gratuity + " and total is $ " + (gratuity + subtotal));
	}
}
