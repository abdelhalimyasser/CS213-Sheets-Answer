public class Main {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter a number between 0 and 1000: ");
		int num = input.nextInt();
		int sum = 0;

		sum += num % 10;
		num /= 10;

		sum += num % 10;
		num /= 10;

		sum += num % 10;

		System.out.println("The sum of the digits is " + sum);
	}
}
