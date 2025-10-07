public class Main {
	public static void main(String[] args) {
		long population = 312032486;
		long seconds = 365 * 24 * 60 * 60;   // year * 365 days * 24 hours * 60 minute * 60 second

		long births = seconds / 7;
		long deaths = seconds / 13;
		long immigrants = seconds / 45;

		// first year
		population = population + births - deaths + immigrants;
		System.out.println("Year 1 population: " + population);

		// second year
		population = population + births - deaths + immigrants;
		System.out.println("Year 2 population: " + population);

		// third year
		population = population + births - deaths + immigrants;
		System.out.println("Year 3 population: " + population);

		// fourth year
		population = population + births - deaths + immigrants;
		System.out.println("Year 4 population: " + population);

		// fifth year
		population = population + births - deaths + immigrants;
		System.out.println("Year 5 population: " + population);
	}
}
