import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter a binary string: ");
		String binary = input.nextLine();

		try {
			int decimal = bin2Dec(binary);
			System.out.println("Decimal value: " + decimal);
		} catch (BinaryFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	public static int bin2Dec(String binary) throws BinaryFormatException {
		int decimalValue = 0;

		for (int i = 0; i < binary.length(); i++) {
			char ch = binary.charAt(i);

			if (ch != '0' && ch != '1')
				throw new BinaryFormatException("Invalid binary character: " + ch);

			decimalValue = decimalValue * 2 + (ch - '0');
		}

		return decimalValue;
	}
}
