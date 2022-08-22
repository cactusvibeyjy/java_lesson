package 인터페이스끼리상속;

public interface DefaultRunnable extends Runnable {
	void displayDetails();
	
	//인터페이스에서도 디폴트 메소드는 만들 수 있다.
	default void hello() {
		System.out.println("Hello");
	}
}
