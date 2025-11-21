import java.math.*;

public class Main
{
	public static void main(String[] args) {
		System.out.printf(" %s\t%s\n", "p", "2^p - 1");
		System.out.println("---------------------");

		for (int p = 2; p <= 100; p++) {
			BigInteger mersenne = BigInteger.valueOf(2).pow(p).subtract(BigInteger.ONE);

			if (mersenne.isProbablePrime(50))
				System.out.printf(" %d\t%s\n", p, mersenne);
		}
	}
}
