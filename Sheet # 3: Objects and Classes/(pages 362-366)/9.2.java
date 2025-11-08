public class Main
{
	public static void main(String[] args) {
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		System.out.printf("The Name: %s\nThe Symbol: %s\nThe Price Change: %.2f%%\n",
		                  stock.name,
		                  stock.symbol,
		                  stock.getChangePercent(34.5, 34.35));
	}
}


class Stock {
	// Class Variabels
	public String name;
	public String symbol;
	public double currentPrice;
	public double previousClosingPrice;

	// Class constractor
	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}

	// getChangePercent to get the percentage of the previos price and the current one
	public double getChangePercent(double previousClosingPrice, double currentPrice) {
		this.previousClosingPrice = previousClosingPrice;
		this.currentPrice = currentPrice;

		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100.0;
	}
}
