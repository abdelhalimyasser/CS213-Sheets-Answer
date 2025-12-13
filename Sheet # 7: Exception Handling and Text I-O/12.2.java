import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = 0, num2 = 0;

		while(true) {
			try {
				System.out.print("Enter num1: ");
				num1 = input.nextInt();

				System.out.print("Enter num2: ");
				num2 = input.nextInt();

				System.out.printf("%d + %d = %d", num1, num2, num1 + num2);

				break;
			} catch(InputMismatchException ex) {
				System.out.println("Integers Only!\nPlease, Try Again!");
				input.nextLine();
			}
		}
	}
}
