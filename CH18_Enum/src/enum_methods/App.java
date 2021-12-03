package enum_methods;

public class App {

	public static void main(String[] args) {
		// enum에서 사용하는 메소드
		
		Fruit[] fruits = Fruit.values(); //values() : 이넘의 모든 상수들을 배열로 리턴
		
		for(Fruit f : fruits) {
			System.out.println(f);
		}
		
		for(Fruit f : Fruit.values()) {
			System.out.println(f);
		}
		
		//ordinal() : 순서(인덱스번호)를 리턴
		System.out.println(Fruit.BANANA.ordinal());
		
		//valueOf("문자열")
		Fruit f1 = Fruit.valueOf("ORANGE");
		System.out.println(f1);
		System.out.println(f1 == Fruit.ORANGE);
		
		
	}

}
