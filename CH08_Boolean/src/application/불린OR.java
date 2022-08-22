package application;

public class 불린OR {

	public static void main(String[] args) {
		
		boolean isRaining = true;
		boolean mightRain = false;
		boolean takeUmbrella = false;
		
		takeUmbrella = isRaining || mightRain;
		//하나의 값이라도 ture면 ture
		
		System.out.println(takeUmbrella);
	}

}
