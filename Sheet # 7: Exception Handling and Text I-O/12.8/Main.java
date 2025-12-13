import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String hex = input.nextLine();

        try {
            int decimal = hex2Dec(hex);
            System.out.println("Decimal value: " + decimal);
        } catch (HexFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static int hex2Dec(String hex) throws HexFormatException {
        int decimalValue = 0;

        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);

            if (!((ch >= '0' && ch <= '9') ||
                  (ch >= 'A' && ch <= 'F') ||
                  (ch >= 'a' && ch <= 'f'))) {
                throw new HexFormatException("Invalid hex character: " + ch);
            }

            decimalValue = decimalValue * 16 + hexCharToDecimal(ch);
        }

        return decimalValue;
    }

    private static int hexCharToDecimal(char ch) {
        if (ch >= '0' && ch <= '9') return ch - '0';
        else if (ch >= 'A' && ch <= 'F') return 10 + (ch - 'A');
        else return 10 + (ch - 'a');
    }
}
