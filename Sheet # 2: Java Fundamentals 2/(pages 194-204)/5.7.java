public class Main
{
	public static void main(String[] args) {
		double tuition = 10000;

        for (int year = 1; year <= 10; year++)
            tuition *= 1.05;

        System.out.printf("Tuition in 10 years: $%.2f%n", tuition);

        double totalCost = 0;
        for (int year = 1; year <= 4; year++) {
            tuition *= 1.05;
            totalCost += tuition;
        }

        System.out.printf("Total cost for 4 years after 10th year: $%.2f%n", totalCost);
	}
}
