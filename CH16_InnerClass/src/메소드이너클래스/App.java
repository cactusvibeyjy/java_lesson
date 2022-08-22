package 메소드이너클래스;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
	private String name;
	
	public App() {
		name = "Elizabeth";
	}
	
	public static void main(String[] args) {
		App app = new App();
		app.run();
	}
	
	private void run() {
		class Task implements Runnable {
			@Override
			public void run() {
				System.out.println(name);
			}
		}
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);

		service.scheduleAtFixedRate(new Task(), 0L, 1L, TimeUnit.SECONDS);
	
		//new Printer().print();
	}	

}
