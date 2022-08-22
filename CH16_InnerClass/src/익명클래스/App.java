package 익명클래스;

public class App {
	private String name = "Sam";
	
	public static void main(String[] args) {
		new App().start();
	}
	
	private void start() {//인터페이스 객체라 원래는 런 개체 실행 못함
//		Runnable runner = new Runnable() {
//			//익명 클래스로 인터페이스 객체 생성
//			public void run() {
//				System.out.println(name);
//			}
//		};
		activate(new Runnable(){
			public void run() {
				System.out.println(name);
			}
		});
	}
		
	
	public void activate(Runnable runnable) {
		runnable.run();
	}

}
