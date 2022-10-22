import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First triangle");
		
		System.out.println("Input the first side");
		double fts1 = sc.nextDouble();
		
		System.out.println("Input the second side");
		double fts2 = sc.nextDouble();
		
		System.out.println("Input the third side");
		double fts3 = sc.nextDouble();
		
		System.out.println("");
		
		System.out.println("Second triangle");
		
		System.out.println("Input the first side");
		double sts1 = sc.nextDouble();
		
		System.out.println("Input the second side");
		double sts2 = sc.nextDouble();
		
		System.out.println("Input the third side");
		double sts3 = sc.nextDouble();
		System.out.println("");
		
		double areat1 = calcArea(fts1,fts2,fts3);
		double areat2 = calcArea(sts1,sts2,sts3);
		String response = (areat1 > areat2) ? "first" : "second";
		
		System.out.printf("Total area of the first triangle: %.2f %n", areat1);
		System.out.printf("Total area of the second triangle: %.2f %n", areat2);
		System.out.printf("The %s triangle is the biggest triangle", response);
		
		sc.close();

	}
	
	public static double calcArea(double a, double b, double c) {
		double p = (a+b+c) / 2;
		
		double area = Math.sqrt(p * (p-a) * (p-b) * (p-c));
		
		return area;
	}

}
