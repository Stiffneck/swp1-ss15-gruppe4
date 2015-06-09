package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import view.Utility;
import view.Mainframe;

public class StationsauswahlPanel extends JPanel {
	private Mainframe mainframe;
	private JButton button2;
	
	public StationsauswahlPanel(Mainframe mainframe){
		this.mainframe = mainframe;
		this.setBackground(Color.GRAY);
		GridBagLayout gbl = new GridBagLayout();
		this.setLayout(gbl);
		
		
//		button2 = new JButton("Der zweite");
//		hauptContainer.add(button2);
	}

	
}
