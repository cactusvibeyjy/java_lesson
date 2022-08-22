package application;

import javax.swing.JFrame;

public class HelloWorld {

	public static void main(String[] args) {
		// JFrame 윈도우 창
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(600, 400); //창사이즈
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);//창을 보이게함

	}

}
