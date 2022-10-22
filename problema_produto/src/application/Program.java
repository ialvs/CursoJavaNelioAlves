package application;

import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		String name = "Calça PFF2";
		double price = 30;
		int quantity = 0;

		Product calca = new Product(name, price, quantity);

		System.out.println("Product data: " + calca.toString());
		calca.addProduct(20);
		System.out.println("Updated product data: " + calca.toString());
		calca.removeProduct(10);
		System.out.println("Updated product data: " + calca.toString());

	}

}
