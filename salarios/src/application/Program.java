package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int runTimes = 3;
		int id = 0;

		List<Employee> employees = new ArrayList<Employee>();

		for (int i = 0; i < runTimes; i++) {
			
			System.out.printf("Employee #%d%n", i + 1);

			System.out.println("Id: ");
			id = sc.nextInt();
			final int checkId = id;

			if (i > 0) {
				Employee newEmployee = employees.stream().filter(employee -> employee.getId() == checkId).findFirst()
						.orElse(null);

				while (newEmployee != null) {
					System.out.println("This id already exists. Enter a new one: ");
					id = sc.nextInt();
					final int checkId2 = id;

					newEmployee = employees.stream().filter(employee -> employee.getId() == checkId2).findFirst()
							.orElse(null);
				}

			}

			sc.nextLine();

			System.out.println("Name: ");
			String name = sc.nextLine();

			System.out.println("Salary: ");
			float salary = sc.nextFloat();

			Employee obj = new Employee(id, name, salary);
			employees.add(obj);

			sc.nextLine();

		}

		System.out.println("");

		System.out.println("Enter the id of the employee that will have a salary increase: ");
		int increaseID = sc.nextInt();

		System.out.println("");

		Employee luckyEmployee = employees.stream().filter(employee -> employee.getId() == increaseID).findFirst()
				.orElse(null);

		if (luckyEmployee != null) {
			System.out.println("Enter the percentage");
			float percentage = sc.nextFloat();
			luckyEmployee.raiseSalary(percentage);

		} else {
			System.out.println("Employee does not exist");
		}

		System.out.println("");

		System.out.println("List of employees: ");

		for (Employee employee : employees) {
			System.out.printf("%d, %s, %.2f%n", employee.getId(), employee.getName(), employee.getSalary());
		}

		sc.close();

	}

	public static boolean checkId(int[] ids, int currentId) {
		boolean response = false;

		for (int id : ids) {
			response = id == currentId;
		}

		return response;
	}

}
