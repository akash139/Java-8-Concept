package Stream_API;

import java.util.*;
import java.util.stream.Stream;


public class StreamAPI { // when the data is more
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(56);
		list.add(15);
		list.add(78);
		list.add(46);
		list.add(36);
		Stream<Integer> s = list.stream();
		 s.forEach(System.out::println);
		 s.forEach(System.out::println);

	}

}