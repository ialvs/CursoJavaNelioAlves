package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int totalGuests = 2;
		Student[] students = new Student[10];
		
		for (int i = 0; i < totalGuests; i++) {
			
			System.out.printf("Rent #%d ",i+1);
			
			System.out.println("Name: ");
			String name = sc.nextLine();
			
			System.out.println("Email: ");
			String email = sc.nextLine();
			
			System.out.println("Room: ");
			int room = sc.nextInt();
			
			sc.nextLine();
			
			students[room] = new Student(name,email,room);
			
			
		}
		
		System.out.println("");
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < students.length; i++) {
			
			if (students[i] != null) {
				System.out.printf("%d: %s, %s%n",students[i].getRoom(),students[i].getName(),students[i].getEmail());
			}
		}
		
		sc.close();

	}

}
