package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	List<Employee> employees = new ArrayList<>();
	//List<OutsourcedEmployee> outEmployees = new ArrayList<>();
	
	int loops = 3;
	
	for (int i = 0; i < loops; i++) {
		System.out.printf("Input the #%d employee's name%n",i+1);
		String name = sc.nextLine();
		
		System.out.printf("Input the #%d employee's hours%n",i+1);
		int hours = sc.nextInt();
		
		System.out.printf("Input the #%d employee's value per hour%n",i+1);
		double valuePerHour = sc.nextDouble();
		
		System.out.printf("Input the #%d employee's additional charge%n",i+1);
		double additionalCharge = sc.nextDouble();
		
		sc.nextLine();
		
		if (additionalCharge > 0) {
			OutsourcedEmployee outsourcedEmployee = new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge);
			employees.add(outsourcedEmployee);
		} else {
			Employee employee = new Employee(name,hours,valuePerHour);
			employees.add(employee);
		}
		
	}
	
	System.out.println("PAYMENTS:");
	
	for (Employee employee : employees) {
		System.out.println(employee.getName() + " - $ " + employee.payment() );
	}
	
	sc.close();
	
}
}


