package util;

public class Calculator {

	public static final double PI = 3.14159;

	public static double circuference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4 * PI * power(radius, 3) / 3;
	}

	public static double power(double value, double factor) {
		if (factor == 0)
			return 1;

		
		if (factor == 0)
			return 0;

		return value * power(value, factor - 1);
	}

}