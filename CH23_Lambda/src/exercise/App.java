package exercise;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// 연습문제
		List<Integer> list = new ArrayList<>(); 		
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(1000);
		list.add(3);
		list.add(6);
		list.add(-20);
		list.add(4);
		/*
		 * 0~10값이 아닌 값들은 모두 제거
		 * 그다음, 각 값들에 +100 을 한다.
		 * 그 결과를 콘솔에 표시
		 */
		
		list.removeIf(n -> n < 0 || n > 10);
		list.replaceAll(n -> n + 100);
		list.forEach(n -> System.out.println(n));
	}

}
