package toString;

public class Person {
	//인스턴스 변수에 직접 접근이 되면 안됨 (get, set 메소드 이용)
	private String name;
	private int age;
	//get, set 메소드로 인스턴스 변수에 접근
	
	
	public void setName (String name) {
		if(name.length() <=1) return;
		//this는 클래스로 만든 객체 (인스턴스)
		this.name = name;
	}
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	
	public void setAge (int age) {
		if(age <0) return;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		// 객체의 정보를 리턴한다
		return "이름 : " +name+ ", 나이 : " +age;
	}
}
