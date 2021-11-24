package thisKeyword;

public class Person {
	// 클래스 안에 만든 변수를 인스턴스 변수 => 객체 생성시 생성됨
	String name;
	int age;
	// get, set 메소드로 인스턴스변수에 접근
	void setName(String name) {
		this.name = name; // this는 인스턴스
	}
	void setAge(int age) {
		this.age = age;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
}
