package 타이머;

import java.util.TimerTask;

public class Task extends TimerTask{

	@Override
	public void run() {
		System.out.println("Hello!");
	}

}
