package interfaces_inheritance;

//인터페이스끼리 상속가능
public interface DefaultRunnable extends Runnable {
	default void displayDetails() { //디폴트 메소드는 메소드
		System.out.println("표시할 디테일 없음");
	}; 
}
