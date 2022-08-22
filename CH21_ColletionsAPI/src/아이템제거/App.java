package 아이템제거;

import java.util.ArrayList;
import java.util.List;

class Cat{
	private String name;
	public Cat(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
}
public class App {
	public static void main(String[] args) {
		Cat c1 = new Cat("마틸다");
		List<Cat> cats = new ArrayList<Cat>();
		cats.add(c1);
		cats.add(new Cat("Ryan"));
		cats.add(new Cat("Micheal"));
		cats.add(new Cat("Jenny"));
		
		//제거하기 인덱스 번호, 객체변수
		cats.remove(1);//Ryan 제거
		cats.remove(c1); //Matilda제거
		
		for(Cat c: cats) {
			System.out.println(c);
		}
	}

}
