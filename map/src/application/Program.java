package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		Map<String,String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711112");
		
		System.out.println("ALL COOKIES:");
		
		for (String key : cookies.keySet()) {
			System.out.println(key + " " + cookies.get(key));
			
		}
		
		System.out.println();
		
		cookies.remove("email");
		
		System.out.println("ALL COOKIES:");
		
		for (String key : cookies.keySet()) {
			System.out.println(key + " " + cookies.get(key));
			
		}
		System.out.println();
		
		cookies.put("phone","4002-8922");
		System.out.println(cookies.get("phone"));
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		
		

	}
	
	

}
