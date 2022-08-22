package school;

public class App {

	public static void main(String[] args) {
		Student p1 = new Student("펭수", 7, false, 36.5);
		Student p2 = new Student("길동", 37, true, 36.5);
		Student p3 = new Student("라이언", 17, false, 37.5);
		Student p4 = new Student("오리온", 27, false, 34.5);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}

}
