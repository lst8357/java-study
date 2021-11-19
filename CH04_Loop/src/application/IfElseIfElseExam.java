package application;

import java.util.Scanner;

public class IfElseIfElseExam {

	public static void main(String[] args) {
		// 스캐너
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("메뉴");
		System.out.println("====");
		System.out.println();
		System.out.println("1. 프린트 '헬로우' ");		
		System.out.println("2. 프린트 '안녕?' ");
		System.out.println("3. 프로그램 종료 ");
		System.out.println();
		System.out.println("옵션을 선택 > ");
		int input = scanner.nextInt();
		scanner.close(); // 스캐너 종료
		
//		if (input == 1) {
//			System.out.println("헬로우");
//		}
//		else if(input == 2) {
//			System.out.println("안녕 ?");
//			
//		}
//		else if(input == 3) {
//			System.out.println("프로그램 종료");
//			
//		}
//		else if(input == 10000) {
//			System.out.println("이스터에그를 발견했습니다.");
//		}
//		else { // 위의 조건들이 아닐경우 실행
//			System.out.println("잘못된 옵션입니다.");
//		}
		
		// Switch case문으로 수정
		switch(input) {
		case 1:
			System.out.println("헬로우");
			break;
		case 2:
			System.out.println("안녕 ?");
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		case 10000:
			System.out.println("이스터에그를 발견했습니다.");
			break;
		default:
			System.out.println("잘못된 옵션입니다.");
			break;
		}	
		
		
		System.out.println("종료합니다...");

	}

}
