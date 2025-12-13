import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the filename: ");
		String filename = console.nextLine();

		File file = new File(filename);

		double sum = 0;
		int count = 0;

		try (Scanner input = new Scanner(file)) {
			while (input.hasNextDouble()) {
				double score = input.nextDouble();
				sum += score;
				count++;
			}

			if (count > 0) {
				System.out.println("Total: " + sum);
				System.out.println("Average: " + (sum / count));
			}
			else
				System.out.println("No scores found in the file.");

		} catch (FileNotFoundException ex) {
			System.out.println("File not found: " + filename);
		}
	}
}
