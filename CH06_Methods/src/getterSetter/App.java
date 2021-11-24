package getterSetter;

public class App {

	public static void main(String[] args) {
		// 인스턴스변수에 직접 접근이 되면 안됨(get,set메소드이용)
		Person p1 = new Person();
		p1.setName("펭수");
		p1.setAge(7);
		
		//private : 다른 클래스에서 접근불가
//		p1.name = "길동";
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());

	}

}
