package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		String path = "c:\\temp\\logs.txt";
		Set<LogEntry> logSet = new HashSet<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				String[] logInfo = line.split(" ");
				
				LocalDateTime date = LocalDateTime.parse(logInfo[1]);
				logSet.add(new LogEntry(logInfo[0],date));
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println("Total users: " + logSet.size());
	}

}
