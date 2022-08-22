package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;


public class Mainframe extends JFrame {
	private static final long serialVersionUID = 1L;

	public Mainframe(String title) {
		super(title);
		setLayout(new BorderLayout());//창에 컴포넌트(버튼)들을 붙이기 위함
		
		//패널 생성하여 창의 위쪽은 툴바 / 가운데 패널붙이기
		add(new Toolbar(), BorderLayout.NORTH);
		add(new Mainpanel(), BorderLayout.CENTER);
		
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	

}
