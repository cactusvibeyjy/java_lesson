package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;


class ColorListener implements ActionListener {
	private Mainpanel mainPanel;
	private Color color;
	
	public ColorListener (Mainpanel mainPanel, Color color) {
		this.mainPanel = mainPanel;
		this.color = color;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		mainPanel.setBackground(color);
	}
	
}

public class Toolbar extends JToolBar {

	private static final long serialVersionUID = 1L;
	public Toolbar(Mainpanel mainPanel) {
		JButton redButton = new JButton("RED");
		JButton blueButton = new JButton("BLUE");
		redButton.addActionListener(new ColorListener(mainPanel, Color.RED));
		blueButton.addActionListener(new ColorListener(mainPanel, Color.BLUE));
		add(redButton);
		add(blueButton);
	}
	

}
