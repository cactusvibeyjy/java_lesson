package application;

public class App {

	public static void main(String[] args) {
		//스테틱 (클래스) 상수는 객체 생성없이 클래스.상수
		System.out.println(Cat.FOOD);
		//수학공식
		System.out.println(Math.PI);
		System.out.println(Cat.getCount());
		
		Cat cat1 = new Cat("matilda");
		System.out.println(Cat.getCount());
		Cat cat2 = new Cat("ryan");
		System.out.println(Cat.getCount());
		Cat cat3 = new Cat("kitty");
		System.out.println(Cat.getCount());
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		System.out.println("고양이 숫자:" +Cat.getCount());
		//System.out.println(cat2.getCount());
		
//		App app = new App();
//		app.sayHi();
		sayHi(); //같은 클래스 내에선 클래스 생략가능
		
	}

	private static void sayHi() {
		System.out.println("Hi!!!!");		
	}

}
