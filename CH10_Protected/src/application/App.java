package application;

//import entitles.*; 패키지 entities안에 있는 모든 클래스
import entitles.Apple;
import entitles.Banana;
import entitles.Fruit;

public class App {
	public static void main(String[] args) {
		//프로텍트protect
		Fruit f1 = new Apple();
		//f1.id=7; id사용 안됨
		System.out.println(f1.toString());
		
		Fruit f2 = new Banana();
		System.out.println(f2.toString());
	}
}
