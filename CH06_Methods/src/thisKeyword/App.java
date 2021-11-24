package thisKeyword;

public class App {

	public static void main(String[] args) {
		// getterSetter 클래스의 Person.java 복사
		Person p1 = new Person();
		p1.setName("펭수");
		p1.setAge(7);
		
		p1.name = "길동";
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
	}

}
