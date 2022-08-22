package application;

import 계층.Cat;
import 계층.Mammal;
import 컬렉션.Wrapper;

public class App {
	public static void main(String[] args) {
		
		Wrapper<Cat> wrapper = new Wrapper<Cat>();
		
		Cat cat = new Cat("마틸다");
		wrapper.set(cat);
		Cat cat2 = wrapper.get();
		System.out.println(cat2);
		
		Wrapper<Mammal> wrapper2 = new Wrapper<>();
		
		Mammal m1 = new Mammal("포유류");
		wrapper2.set(m1);;
		Mammal m2 = wrapper2.get();
		System.out.println(m2);
	}
}
