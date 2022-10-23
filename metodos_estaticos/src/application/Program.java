package application;

import java.util.Locale;

import util.Calculator;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		double radius = 3.0;
		
		System.out.printf("Circuference: %.2f%n",Calculator.circuference(radius));
		System.out.printf("Volume: %.2f%n",Calculator.volume(radius));
		System.out.printf("π: %.2f%n",Calculator.PI);
		
	}

}
