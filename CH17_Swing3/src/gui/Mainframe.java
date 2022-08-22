package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;


public class Mainframe extends JFrame {
	private static final long serialVersionUID = 1L;

	public Mainframe(String title) {
		super(title);
		Mainpanel mainPanel = new Mainpanel();
		mainPanel.setBackground(Color.pink);
		setLayout(new BorderLayout());//창에 컴포넌트(버튼)들을 붙이기 위함
		
		//패널 생성하여 창의 위쪽은 툴바 / 가운데 패널붙이기
		add(new Toolbar(mainPanel), BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER);
		
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	

}
