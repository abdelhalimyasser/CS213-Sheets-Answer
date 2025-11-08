import java.util.GregorianCalendar;

public class Main
{
	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.printf("Current Date: %d-%d-%d\n",
		                  calendar.get(GregorianCalendar.YEAR),
		                  calendar.get(GregorianCalendar.MONTH) + 1,
		                  calendar.get(GregorianCalendar.DAY_OF_MONTH));

		calendar.setTimeInMillis(1234567898765L);
		System.out.printf("Date for 1234567898765L: %d-%d-%d\n",
		                  calendar.get(GregorianCalendar.YEAR),
		                  calendar.get(GregorianCalendar.MONTH) + 1,
		                  calendar.get(GregorianCalendar.DAY_OF_MONTH));
	}
}
