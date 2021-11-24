package school;

public class App {

	public static void main(String[] args) {
		// 학생 객체 만들기
		Student s1 = new Student("펭수", 7);
		Student s2 = new Student("길동", 37);
		Student s3 = new Student("라이언", 17);
		Student s4 = new Student("오리온", 27);
		
		s1.setVisible(false);
		
		s2.setVisible(true);
		s2.setTemperature(35.5);
		
		s3.setVisible(true);
		s3.setTemperature(36.3);
		
		s4.setVisible(false);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
	}

}
