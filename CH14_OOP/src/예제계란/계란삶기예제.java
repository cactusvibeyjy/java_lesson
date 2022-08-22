package 예제계란;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

class Task2 extends TimerTask {

	@Override
	public void run() {
		System.out.println("계란 삶는 중");
	}
	
}
class Task implements Runnable {

	@Override
	public void run() {
		JOptionPane.showMessageDialog(null, "계란삶기 완료!");
	}
	
}

public class 계란삶기예제 {
	public static void main(String[] args) {	
	Timer timer = new Timer();
	timer.scheduleAtFixedRate(new Task2(), 0, 1000);
	ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
	executor.scheduleAtFixedRate(new Task(), 10, 10, TimeUnit.SECONDS);
	
	}
	
}
