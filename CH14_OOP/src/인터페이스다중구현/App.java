package 인터페이스다중구현;

public class App {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.greet();
		p1.speak();
		
		//그 인터페이스의 메소드만 실행이 가능
		Greeter p2 = new Person();
		p2.greet();
		//p2.speak();
		
		//그 인터페이스의 메소드만 실행이 가능
		Speaker p3 = new Person();
		//p3.greet();
		p3.speak();
		
	}
}
