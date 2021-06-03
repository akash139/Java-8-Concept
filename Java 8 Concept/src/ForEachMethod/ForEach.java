package ForEachMethod;

import java.util.*;
import java.util.function.Consumer;

public class ForEach {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		// -> External Iterations

		System.out.print("External Iterations -> ");
		for (int i : values) {
			System.out.print(i + " ");
		}

		Consumer<Integer> c = new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println(t);
			}
		};

		// -> Internal Iterations
		System.out.print("\n\nInternal Iterations -> ");
		values.forEach(i -> System.out.print(i + " "));
		System.out.println();
		values.forEach(c);
	}
}