import java.util.Date;

class Account {
	// Class variables
	private int id;
	private double balance;
	private double  annualInterestRate;
	private Date date;

	// No-arg Class constractors
	public Account() {
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.date = new Date();
	}

	// Class constructor with id and balance
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = 0;
		this.date = new Date();
	}

	// Class Accessors
	public int getId() {
		return this.id;
	}

	public double getBalance() {
		return this.balance;
	}

	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}

	public Date getDate() {
		return this.date;
	}

	// Class Mutators
	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public void setDate() {
		this.date = new Date();
	}

	// Class functianol methods
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public void withdraw(double amount) {
		if (amount <= balance) { this.balance -= amount; }
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
}
