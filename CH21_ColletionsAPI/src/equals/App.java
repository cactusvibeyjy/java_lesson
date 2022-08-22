package equals;

class Person{
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true; // 같은 객체일경우 true
		if (obj == null)
			return false; //널일때 false
		if (getClass() != obj.getClass())
			return false;	//클래스 다를경우 false
		Person other = (Person) obj;
		if (other.name == null) return false;
		//이름으로 비교
		return this.name.equals(other.name);
	}
	
}
	

public class App {
public static void main(String[] args) {
		
		Person p1 = new Person("펭수");
		Person p2 = new Person("펭수");
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		//문자열 비교시 == 사용하지 말고 equals 사용
		String s1 = new String("문자열");
		String s2 = "문자열";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
//		Scanner scan = new Scanner(System.in);
//				
//		System.out.print("입력 y/n : ");
//		String input = scan.nextLine();
//		
//		if(input.equals("y")) {
//			System.out.println("예스");
//		}
		
	}
}


