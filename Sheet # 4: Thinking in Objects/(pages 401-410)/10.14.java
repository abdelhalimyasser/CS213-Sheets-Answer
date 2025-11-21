import java.util.*;

public class Main
{
	public static void main(String[] args) {
		MyDate date1 = new MyDate();
		System.out.println("Date1: " + date1.getYear() + "-" + (date1.getMonth() + 1) + "-" + date1.getDay());

		MyDate date2 = new MyDate(561555550000L);
		System.out.println("Date2: " + date2.getYear() + "-" + (date2.getMonth() + 1) + "-" + date2.getDay());
	}
}

class MyDate {
	private int year;
	private int month;
	private int day;

	// No-arg constructor
	public MyDate() {
		Calendar calendar = new GregorianCalendar();

		this.year = calendar.get(Calendar.YEAR);
		this.month = calendar.get(Calendar.MONTH);
		this.day = calendar.get(Calendar.DAY_OF_MONTH);
	}

	// Unix time Constructor
	public MyDate(long elapsedTime) {
		setDate(elapsedTime);
	}

	// Default Constructor
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// Getters
	public int getYear() {
		return this.year;
	}

	public int getMonth() {
		return this.month;
	}

	public int getDay() {
		return this.day;
	}

	public void setDate(long elapsedTime) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elapsedTime);

		this.year = calendar.get(Calendar.YEAR);
		this.month = calendar.get(Calendar.MONTH);
		this.day = calendar.get(Calendar.DAY_OF_MONTH);
	}
}
