package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> nameList = new ArrayList<>();
		
		nameList.add("Maria");
		nameList.add("Alex");
		nameList.add("Bob");
		nameList.add("Anna");
		
		showList(nameList);
		System.out.println("");
		
		nameList.add(2,"Marco");
		showList(nameList);
		
		System.out.println("");
		System.out.println(nameList.size());
		
		/*nameList.remove("Anna");
		System.out.println("");
		showList(nameList);*/
		
		/*nameList.remove("Alex");
		System.out.println("");
		showList(nameList);*/
		
		/*nameList.removeIf(x -> x.charAt(0) == 'M');
		System.out.println("");
		showList(nameList);*/
		
		System.out.println("");
		System.out.printf("Index of Bob: %d",nameList.indexOf("Bob"));
		
		System.out.println("");
		System.out.printf("Index of Marco: %d",nameList.indexOf("Marco"));
		
		List<String> nameListOnlyA = nameList.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		System.out.println("");
		System.out.println("");
		showList(nameListOnlyA);
		
		System.out.println("");
		String name = nameList.stream().filter(x -> x.charAt(0) == 'I').findFirst().orElse(null);
		
		System.out.println(name);
	

	}
	
	public static void showList(List<String> list) {
		for (String item : list) {
			System.out.println(item);
		}
	}

}
