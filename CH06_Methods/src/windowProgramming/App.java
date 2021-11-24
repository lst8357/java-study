package windowProgramming;

public class App {

	public static void main(String[] args) {
		// 윈도우 클래스를 작성하여 사용
		Window window = new Window();
		window.setWidth(300);
		
		System.out.println(window.getWidth());
		System.out.println(window.getheight());
		System.out.println(window.getisVisible());
		System.out.println(window.gettop());
		System.out.println(window.getleft());

	}

}
