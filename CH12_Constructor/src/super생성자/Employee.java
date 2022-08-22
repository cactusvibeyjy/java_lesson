package super생성자;

public class Employee extends Person {
	public Employee() {
		super("unknown"); //생략됨 = person의 생성자 -> 상속받은 부모 클래스의 생성자
		System.out.println("Employee 생성자!");
	}
}
