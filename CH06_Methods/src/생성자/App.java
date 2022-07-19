package 생성자;

public class App {
	public static void main(String[] args) {
		Person p1 = new Person("Peter", 160.0);
		//p1.setName("Peter");
		//p1.setHeight(160.0);
		
		Person p2 = new Person("Mike", 178.0);
		//p2.setName("Mike");
		//p2.setHeight(178.0);
		Person p3 = new Person("Dru", 187.0);
		//p3.setName("Dru");
		//p3.setHeight(187.0);
		
		System.out.println(p1.getName());
		System.out.println(p1.getHeight());
		System.out.println(p2.getName());
		System.out.println(p2.getHeight());
		System.out.println(p3.getName());
		System.out.println(p3.getHeight());
		
	}
}
