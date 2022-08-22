package 기본생성자;

public class App {
	public static void main(String[] args) {
		
		Person p= new Person();
		System.out.println(p);
		Person p1 = new Person("Smith");
		System.out.println(p1);
		Person p2 = new Person("Eric", 22);
		System.out.println(p2);
	}

}
