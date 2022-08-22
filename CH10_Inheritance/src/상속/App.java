package 상속;

import 다형성.Housecat;
import 다형성.Roadcat;
import 다형성.Tiger;

public class App {

	public static void main(String[] args) {
		//고양이 클래스, 집고양이, 길고양이 상속받음
		
		Housecat cat1= new Housecat();
		cat1.vocal();
		cat1.hunt();
		
		Roadcat cat2 = new Roadcat();
		cat2.vocal();
		cat2.hunt();
		
		Tiger cat3 = new Tiger();
		cat3.vocal();
		cat3.hunt();
		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		System.out.println(cat3);
	}

}
