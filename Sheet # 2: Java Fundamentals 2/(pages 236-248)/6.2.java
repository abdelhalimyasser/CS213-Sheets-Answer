public class Main {
	public static void main(String[] args) {
	    System.out.println(sumDigits(234));
	}

	public static long sumDigits(long n) {
		long sum = 0;
		while(n != 0) {
			sum += (n % 10);
			n /= 10;
		}
		return sum;
	}
}
