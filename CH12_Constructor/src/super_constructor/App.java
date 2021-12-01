package super_constructor;

import this_Constructor.Employee;

public class App {

	public static void main(String[] args) {
		//
		Employee e1 = new Employee();
		
		System.out.println(e1);
		
		Employee e2 = new Employee("김펭수");
		
		System.out.println(e2);

	}

}
