package 상속예제;

public class Drink {
	public static void main(String[] args) {
		Juice j = new Juice();
		Coffee c = new Coffee();
		Beer b = new Beer();
		Water w = new Water();
		Tea t = new Tea();
		
		Drink[] drinks = {j, c, b, w, t};
		for (Drink d : drinks) {
			d.ordered();
		}
	}

	private void ordered() {
		System.out.println("주문되었습니다.");
	}

}



class Juice extends Drink{
//	String name;
//	double price;
//	public void ordered() {
//		System.out.println("주문되었습니다.");
//	}
}

class Coffee extends Drink{
	
}

class Beer extends Drink{
	
}

class Water extends Drink{
	
}
class Tea extends Drink{
	
}
