package application;

public class 불린AND {

	public static void main(String[] args) {
		// ==, !=, !, &&,|| 비교 및 논리 연산자
		boolean isRaining = false;
		boolean haveUmbrella = true;
		boolean takeUmbrella = false;
		
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella = true;
			}
		}
		System.out.println("첫번째 : " +takeUmbrella);
		
		if(isRaining && haveUmbrella) {
			takeUmbrella = true;
		}
		System.out.println("두번째 : " +takeUmbrella );
		takeUmbrella = isRaining && haveUmbrella ? true : false;
				System.out.println("세번째 : "+takeUmbrella);
		
		

	}

}
