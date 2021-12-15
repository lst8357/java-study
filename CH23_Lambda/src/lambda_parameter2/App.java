package lambda_parameter2;

interface Runner {
	void excute(String name, String text); // 추상메서드에 매개변수가 있는경우
}

public class App {
	public static void main(String[] args) {
		// 매개변수가 있는 경우
		Runner run1 = (n, t) -> System.out.printf("%s 님 %s",n, t);
		run1.excute("펭수", "안녕하세요!");
		
	}

}
