package 인터페이스끼리상속;

public class App {
	public static void main(String[] args) {
		DefaultRunnable m1 = new Machine();
		m1.run();
		m1.displayDetails();
		m1.hello();
	}
}
