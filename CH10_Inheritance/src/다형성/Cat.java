package 다형성;
//모든 클래스는 object 클래스를 상속받는다
public class Cat {

	public void vocal() {
		System.out.println("meow~");
	}
	public void hunt() {
		System.out.println("hunting");
	}
	@Override
	public String toString() {
		// object클래스의 toString을 오버라이드
		return "고양이";
	}
}
