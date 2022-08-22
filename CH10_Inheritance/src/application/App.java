package application;

import entities.Apple;
import entities.Banana;
import entities.Fruit;

public class App {
	public static void main(String[] args) {
		Fruit f1 = new Apple();
		//f1.id = 10; 아이디는 프로텍디드 =>패키지도 다르고 App이 자식 클래스도 아님
		System.out.println(f1);
		
		Fruit f2 = new Banana();
		System.out.println(f2);
	}

}
