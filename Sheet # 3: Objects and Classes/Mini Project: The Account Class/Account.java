class Account {
	// Class variables
	private int id;
	private double balance;
	private double  annualInterestRate;
	private date = new Date();

	// Class constractors
	public Account() {
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.date = new Date();
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	// Class setters methods
	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	// Class getters methods
	public int getId() {
		return this.id;
	}

	public double getBalance() {
		return this.balance;
	}

	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}

	// Class functianol methods
	getMonthlyInterestRate() {
	}

	withdraw() {
	}

	deposite() {
	}
}
