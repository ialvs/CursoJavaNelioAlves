package application;

import java.util.Locale;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double dollarPrice = 3.10;
		double dollarsBought = 200.0;
		
		System.out.printf("Dollar price: %.2f%n",dollarPrice);
		System.out.printf("Dollars bought: %.2f%n",dollarsBought);
		System.out.printf("Amount to be paid in reais: %.2f%n",CurrencyConverter.convertCurrency(dollarPrice, dollarsBought));
		

	}

}
