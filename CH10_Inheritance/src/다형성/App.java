package 다형성;

public class App {

	public static void main(String[] args) {
		Cat[] cats = {new Housecat(), new Roadcat(), new Tiger()};
		
//		cats[0].vocal();
//		cats[0].hunt();
//		cats[1].vocal();
//		cats[1].hunt();
//		cats[2].vocal();
//		cats[2].hunt();
		
		for (int i =0; i < cats.length; i++) {
			cats[i].vocal();
			cats[i].hunt();
		}
		for(Cat c:cats) {
			c.vocal();
			c.hunt();
		}
		Cat cat1 = new Housecat();//업캐스팅 => 부모타입으로 선언
		cat1.vocal();
		cat1.hunt();
		
		//cat1.callMaster(); 부모타입일때 부모타입이 가능한 메소드만 가능
		Housecat cat2 = (Housecat)cat1; //다운 캐스팅 =>자식타입으로
		cat2.callMaster();
	}

}
