package super생성자;

public class Person {
	private String name;
	public Person(String name) {
		//부모생성자 먼저 출력 후 상속받은 자식 클래스 출력
		System.out.println("Person 생성자!");
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
}