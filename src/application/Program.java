package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<>();
		
		set.add("Pedro");
		set.add("João");
		set.add("Maria");
		
		System.out.println(set.contains("clovis"));

		for(String p: set) {
			System.out.println(p);
		}
	}

}
