package 타이머;

import java.util.Timer;
import java.util.TimerTask;

//class Task extends TimerTask{

public class App {
	public static void main(String[] args) {
		Timer timer = new Timer();
		//task를 1000ms (1초) 간격으로 반복
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				System.out.println("Hello");
			}
		}, 0, 1000);
	}
}

//@Override
//public void run() {
//System.out.println("Hello");	
//}
