package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("First triangle");

		System.out.println("Input the first side");
		double a1 = sc.nextDouble();

		System.out.println("Input the second side");
		double b1 = sc.nextDouble();

		System.out.println("Input the third side");
		double c1 = sc.nextDouble();

		System.out.println("");

		System.out.println("Second triangle");

		System.out.println("Input the first side");
		double a2 = sc.nextDouble();

		System.out.println("Input the second side");
		double b2 = sc.nextDouble();

		System.out.println("Input the third side");
		double c2 = sc.nextDouble();
		System.out.println("");

		Triangle t1 = new Triangle(a1, b1, c1);
		Triangle t2 = new Triangle(a2, b2, c2);
		String response = (t1.calcArea() > t2.calcArea()) ? "first" : "second";

		System.out.printf("Total area of the first triangle: %.4f %n", t1.calcArea());
		System.out.printf("Total area of the second triangle: %.4f %n", t2.calcArea());
		System.out.printf("The %s triangle is the biggest triangle", response);
		
		sc.close();

	}

}
