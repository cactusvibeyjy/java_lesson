package 생성자;

public class Person {
	private String name;
	private double height;
	//기본 생성자는 생략 가능
	public Person() {
		// 기본 생성자는 public 클래스명으로 시작
		name = "이름미상";
		//String height = "Not yet reported";
		System.out.println("Person 객체를 생성");
	}
	public Person (String name) {
		System.out.println("Person 객체를 생성");
	}
	public Person(String name, double height) {
		//super();
		this.name = name;
		this.height = height;
		System.out.println("Person 객체를 생성");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	
	
	
	
	
}
