package MethodReference;

import java.util.*;

public class MethodReference {
	public static void main(String[] args) {
		HashSet<Object> name = new HashSet<>();
		name.add("Zunaid");
		name.add("Akash");
		name.add("Ali");
		name.add("Akram");
		name.add("Akash");
		name.forEach(System.out::println);

		System.out.println();

		List<Object> age = Arrays.asList("Hello", "Akash", "Welcome", "to", "Eclipse IDE");
		age.forEach(System.out::println);

	}
}