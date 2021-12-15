package lambda_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ReplaceAll {
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(); 
	
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		numbers.add(6);
		numbers.add(8);
		
		numbers.replaceAll(n -> n * n);
		
		numbers.forEach(n -> System.out.println(n));
		
		List<String> friends = new ArrayList<String>();
		friends.add("펭수");
		friends.add("길동");
		friends.add("메리");
		friends.add("철수");
		friends.replaceAll(s -> "안녕~ " + s);
		friends.forEach(s -> System.out.println(s));
	}
}
