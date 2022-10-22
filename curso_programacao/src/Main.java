import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*String hello = "Here we go again";
		System.out.println(hello);
		System.out.println("Ba dia");
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		Locale.setDefault(Locale.US);
		System.out.println(x);
		System.out.println(hello + " " +  x);
		System.out.printf("RESULTADO = %.2f metros%n",x);
		
		String name = "Maria";
		int age = 31;
		double money = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha %.2f reais%n", name,age,money); */
		
		/*String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;*/
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Input the first product");
	    String product1 = sc.next();
	    System.out.println("Input the second product");
	    String product2 = sc.next();
        
	    System.out.println("Input the age");
        int age = sc.nextInt();
        System.out.println("Input the code");
        int code = sc.nextInt();
        System.out.println("Input the gender");
        char gender = sc.next().charAt(0);
        
        System.out.println("Input the first price");
        double price1 = sc.nextDouble();
        System.out.println("Input the second price");
        double price2 = sc.nextDouble();
        System.out.println("Input the measure");
        double measure = sc.nextDouble();
        
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1,price1);
		System.out.printf("%s, which price is $ %.2f%n", product2,price2);
		
		System.out.println("");
		
		System.out.printf("Record: %d years old, code %d and gender: %s %n",age,code,gender);
		
		System.out.println("");
		
		System.out.printf("Measure with eight decimal places: %.8f %n",measure);
		System.out.printf("Rounded (three decimal places: %.3f %n",measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f",measure);
		
		sc.close();

	}

}
