import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int[] numbers = new int[100];
		
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = (int)(Math.random() * 1000);

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index: ");

		try {
			int index = input.nextInt();
			System.out.println("Value at index " + index + ": " + numbers[index]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds");
		}
	}
}
