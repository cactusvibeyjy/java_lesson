package 타이머2;

import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import 타이머.Task;

import java.util.TimerTask;

class Task2 implements Runnable {
	@Override
	public void run() {
	System.out.println("Hello~");
	}
}


public class App {
	public static void main(String[] args) {
		Timer timer = new Timer();
		//task를 1000ms (1초) 간격으로 반복
		timer.scheduleAtFixedRate(new Task(), 0L, 1000L);
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task2(), 0, 1, TimeUnit.SECONDS);
		JOptionPane.showMessageDialog(null, "계란 삶기 완료");
	
	}
}
