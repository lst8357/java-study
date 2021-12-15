package example;

import java.util.ArrayList;
import java.util.List;

public class App3 {
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(); 		
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		numbers.add(6);
		numbers.add(8);
		
		numbers.removeIf(App3::filter);
		numbers.replaceAll(n -> n * 2);
	
		numbers.forEach(System.out::println);
	
	}
	
	private static boolean filter(int n) {
		return n < 5;
	}
	private static int map(int n) {
		return n * 2;
	}
	
	
	
}