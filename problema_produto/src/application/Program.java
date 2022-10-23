package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		/*String name = "Calça PFF2";
		double price = 30;
		int quantity = 0;

		Product calca = new Product(name, price, quantity);

		System.out.println("Product data: " + calca.toString());
		calca.addProduct(20);
		System.out.println("Updated product data: " + calca.toString());
		calca.removeProduct(10);
		System.out.println("Updated product data: " + calca.toString());*/
		
		int n = 3;
		double accumulator = 0;
		
		Product[] products = new Product[n];
		
		for (int i = 0; i < products.length; i++) {
			
			System.out.printf("Input the %dº product name %n",i+1);
			String name = sc.nextLine();
			
			System.out.printf("Input the %dº product price %n",i+1);
			double price = sc.nextDouble();
			
			sc.nextLine();
			
			products[i] = new Product(name,price);
			accumulator += products[i].getPrice();
		}
		
		double average = accumulator / products.length;
		
		System.out.printf("The average price of all %d products is $ %.2f%n",products.length,average);
		
		sc.close();
	}

}
