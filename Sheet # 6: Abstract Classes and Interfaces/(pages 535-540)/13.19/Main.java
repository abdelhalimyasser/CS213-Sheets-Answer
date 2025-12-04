import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        String s = input.next();

        Rational r = convertToRational(s);

        System.out.println("The fraction number is " + r);
    }

    public static Rational convertToRational(String s) {
        boolean negative = s.startsWith("-");
        if (negative) s = s.substring(1);

        if (!s.contains(".")) {
            // Pure integer
            return new Rational(Long.parseLong(s), 1);
        }

        String[] parts = s.split("\\.");
        String integerPart = parts[0];
        String fractionalPart = parts[1];

        long denominator = (long) Math.pow(10, fractionalPart.length());
        long numerator = Long.parseLong(integerPart + fractionalPart);

        if (negative) numerator = -numerator;

        return new Rational(numerator, denominator);
    }
}
