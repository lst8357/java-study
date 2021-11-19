package application;

import java.util.Scanner;

public class NewArrayEx {

	public static void main(String[] args) {
		final int NUM = 3;
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[NUM];
		
		for (int i=0; i < NUM; i++) {
			System.out.print("숫자를 입력: ");
			numbers[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		System.out.println("입력한 값은: ");
		
		int total = 0;
		
		for(int i=0; i<NUM; i++) {
			System.out.println(numbers[i]);
			total = total + numbers[i];
		}
		
		System.out.println("Total: " + total);

	}

}
