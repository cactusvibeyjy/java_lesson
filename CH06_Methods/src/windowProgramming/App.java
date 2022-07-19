package windowProgramming;

public class App {

	public static void main(String[] args) {
		
		Window window = new Window();
		window.setWidth(300);
		window.setHeight(300);
		window.setLeft(100);
		window.setTop(50);
		
		
		System.out.println(window.getTop());

	}

}
