package 기본생성자;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		System.out.println("디폴트 생성자 생성됨");
		name = "unknow";
		age = 0;
	
	}
	
	public Person(String name) {
		System.out.println("퍼슨 객체 생성됨!");
		this.name = name;
		age = 0;
	}
	public Person(String name, int age) {
		System.out.println("퍼슨객체 생성됨!");
		this.name=name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name = " + name + ", age = " + age + "]";
	}

	
	
	
}
