package toString;
//한개의 java파일레 public 클래스는 하나다.

public class App {

	public static void main(String[] args) {
		Person p1 = new Person("Sam", 7);
		
		
//		p1.setName ("펭수");
//		p1.setAge(7);
		
		
		Person p2 = new Person("Eric", 17);
//		p2.setName("Sam");
//		p2.setAge(17);
//		System.out.println(p1.getName());
//		System.out.println(p1.getAge());
//		System.out.println(p2.getName());
//		System.out.println(p2.getAge());
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
	}

}
