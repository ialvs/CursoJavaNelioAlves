package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		String path = "c:\\temp\\names.txt";
		List<String> names = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				names.add(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		Collections.sort(names);
		
		for (String name : names) {
			System.out.printf("%s%n",name);
		}

	}

}
