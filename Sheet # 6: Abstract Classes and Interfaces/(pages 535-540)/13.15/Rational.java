import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {
    private BigInteger numerator;
    private BigInteger denominator;

    public Rational() {
        this(BigInteger.ZERO, BigInteger.ONE);
    }

    public Rational(BigInteger numerator, BigInteger denominator) {
        if (denominator.equals(BigInteger.ZERO)) {
            throw new ArithmeticException("Denominator cannot be zero");
        }

        BigInteger gcd = numerator.gcd(denominator);
        if (denominator.compareTo(BigInteger.ZERO) < 0) {
            numerator = numerator.negate();
            denominator = denominator.negate();
        }

        this.numerator = numerator.divide(gcd);
        this.denominator = denominator.divide(gcd);
    }

    public BigInteger getNumerator() {
        return numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }

    public Rational add(Rational second) {
        BigInteger n = numerator.multiply(second.denominator)
                        .add(denominator.multiply(second.numerator));
        BigInteger d = denominator.multiply(second.denominator);
        return new Rational(n, d);
    }

    public Rational subtract(Rational second) {
        BigInteger n = numerator.multiply(second.denominator)
                        .subtract(denominator.multiply(second.numerator));
        BigInteger d = denominator.multiply(second.denominator);
        return new Rational(n, d);
    }

    public Rational multiply(Rational second) {
        BigInteger n = numerator.multiply(second.numerator);
        BigInteger d = denominator.multiply(second.denominator);
        return new Rational(n, d);
    }

    public Rational divide(Rational second) {
        BigInteger n = numerator.multiply(second.denominator);
        BigInteger d = denominator.multiply(second.numerator);
        return new Rational(n, d);
    }

    @Override
    public int compareTo(Rational o) {
        BigInteger left = numerator.multiply(o.denominator);
        BigInteger right = denominator.multiply(o.numerator);
        return left.compareTo(right);
    }

    @Override
    public String toString() {
        if (denominator.equals(BigInteger.ONE)) {
            return numerator.toString();
        } else {
            return numerator + "/" + denominator;
        }
    }

    @Override
    public int intValue() {
        return numerator.divide(denominator).intValue();
    }

    @Override
    public long longValue() {
        return numerator.divide(denominator).longValue();
    }

    @Override
    public float floatValue() {
        return numerator.floatValue() / denominator.floatValue();
    }

    @Override
    public double doubleValue() {
        return numerator.doubleValue() / denominator.doubleValue();
    }
}
