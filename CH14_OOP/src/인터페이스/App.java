package 인터페이스;

public class App {

	public static void main(String[] args) {
		Describable [] objs = {new Person(), new Computer()};
		//object클래스 모든 클래스의 부모클래스
		
		for(Describable obj: objs) {
			System.out.println(obj.getDescription());
		}
	}

}
