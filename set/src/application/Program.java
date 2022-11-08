package application;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		/*Set<String> set = new TreeSet<>();
		Set<String> set = new LinkedHashSet<>();*/
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		System.out.println(set.contains("Tv"));
		set.remove("Tablet");
		set.removeIf(x -> x.charAt(0) == 'T');
		
		set.add("Notebook");
		for (String product : set) {
			System.out.println(product);
		}

	}

}
