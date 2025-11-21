public class Main
{
	public static void main(String[] args) {
	    long start = (long)Math.sqrt(Long.MAX_VALUE) + 1;
	    
		for (int i = 0; i < 10; i++) {
			java.math.BigInteger n = java.math.BigInteger.valueOf(start + i);
			System.out.println(n.multiply(n));
		}

	}
}
