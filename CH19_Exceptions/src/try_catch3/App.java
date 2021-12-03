package try_catch3;

import java.util.Scanner;

public class App {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// 예외를 처리하는 try-catch 문

		int number = getNumber();
		System.out.println("입력한 숫자는 : " + number);
		scanner.close();
		}

	private static int getNumber() { //숫자를 입력 받아서 리턴
		int number = 0;
		boolean isNumber = false;
		
		//숫자를 입력할때까지 반복 do while문 사용
		
		System.out.println("숫자를 입력 :");
		String line = scanner.nextLine();
		scanner.close(); //스캐너 종료
		
		
		try { // 예외가 발생할수 있는 코드를 적용
			number = Integer.parseInt(line); // 문자열을 정수로 변환
			isNumber = true;
		} catch (NumberFormatException e) { // 예외 발생시 프로그램 종료가 아니라 여기로 이동
			System.out.println("정수로 변환할수 없습니다.");
		}
		return 0;
	}

}
