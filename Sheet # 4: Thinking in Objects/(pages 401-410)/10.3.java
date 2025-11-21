public class Main
{
	public static void main(String[] args) {
		MyInteger num1 = new MyInteger(7);
		MyInteger num2 = new MyInteger(10);

		System.out.println("num1 is even? " + num1.isEven());
		System.out.println("num1 is odd? " + num1.isOdd());
		System.out.println("num1 is prime? " + num1.isPrime());

		System.out.println("num2 is even? " + num2.isEven());
		System.out.println("num2 is odd? " + num2.isOdd());
		System.out.println("num2 is prime? " + num2.isPrime());

		System.out.println("Is 11 prime? " + MyInteger.isPrime(11));
		System.out.println("Is 20 even? " + MyInteger.isEven(20));

		System.out.println("num1 equals 7? " + num1.equals(7));
		System.out.println("num1 equals num2? " + num1.equals(num2));

		char[] chars = {'1', '2', '3'};
		System.out.println("parseInt(chars) = " + MyInteger.parseInt(chars));
		System.out.println("parseInt(\"456\") = " + MyInteger.parseInt("456"));
	}
}

class MyInteger {
	private int value;

	// Constractor
	public MyInteger(int value) {
		this.value = value;
	}

	// Getter Methode
	public int getValue() {
		return value;
	}

	// Instance Methods
	public boolean isEven() {
		return value % 2 == 0;
	}

	public boolean isOdd() {
		return value % 2 != 0;
	}

	public boolean isPrime() {
		if(value < 1)
			return false;

		for (int i = 2; i <= value * value; i++)
			if (value % i == 0)
				return false;

		return true;
	}

	// Static methods with int parameter
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}

	public static boolean isOdd(int n) {
		return n % 2 != 0;
	}

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
			
		for (int i = 2; i <= n * n; i++)
			if (n % i == 0)
				return false;

		return true;
	}

    // Static methods with MyInteger parameter
	public static boolean isEven(MyInteger integer) {
		return integer.isEven();
	}

	public static boolean isOdd(MyInteger integer) {
		return integer.isOdd();
	}

	public static boolean isPrime(MyInteger integer) {
		return integer.isPrime();
	}

	// Equals Methodes
	public boolean equals(int value) {
		return this.value == value;
	}

	public boolean equals(MyInteger integer) {
		return integer.value == value;
	}

	// Parsing Methhode
	public static int parseInt(char[] chars) {
		return Integer.parseInt(new String(chars));
	}

	public static int parseInt(String str) {
		return Integer.parseInt(str);
	}
}
