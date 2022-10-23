package util;

public class CurrencyConverter {
	
	private static final double IOF = 0.06;
	
	public static double convertCurrency(double dollarPrice, double boughtDollars) {
		return boughtDollars * dollarPrice * (1.0 + IOF);
	}
	
}

/**/