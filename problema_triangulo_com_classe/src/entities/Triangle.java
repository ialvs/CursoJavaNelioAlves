package entities;

public class Triangle {

	private double a;
	private double b;
	private double c;
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double calcArea(/*double a, double b, double c*/) {
		double p = (this.a + this.b + this.c) / 2;

		return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
	}

}
