package application;

public class BooleanOr {

	public static void main(String[] args) {
		// A || B => 둘중에 하나라도 참이면 참
		boolean isRaining = true; // 비가 오는가?
		boolean mightRain = false; // 우산을가지고 있나?
		boolean takeUmbrella = false; // 우산을 쓰나?
		
		takeUmbrella = isRaining || mightRain;
		
		System.out.println(takeUmbrella);
	}

}
