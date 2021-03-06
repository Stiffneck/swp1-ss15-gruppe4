package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import view.Utility;
import view.Mainframe;

public class StationsauswahlPanel extends JPanel {
	private Mainframe mainframe;
	private JButton button;
	private JLabel stationsname;
	
	public StationsauswahlPanel(Mainframe mainframe){
		this.mainframe = mainframe;
		this.setBackground(Color.GRAY);
		GridBagLayout gbl = new GridBagLayout();
		this.setLayout(gbl);
		
		
		GridBagConstraints gbc = Utility.makeGbc(0, 0, 1, 1, GridBagConstraints.EAST,GridBagConstraints.HORIZONTAL);
		stationsname = new JLabel("Station: ");
		this.add(stationsname, gbc);
		
		gbc = Utility.makeGbc(1, 0, 1, 1, GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL);
		JComboBox stationsliste = new JComboBox();
//		stationsliste.setSelectedIndex();
		stationsliste.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//methode 
				
			}
		});
		
		this.add(stationsliste);
		gbc = Utility.makeGbc(2, 0, 1, 1, GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL);
		button = new JButton("Ausgeben");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//methode zum Anzeigen aller Patienten
				
			}
		});
		button.setPreferredSize(new Dimension(50,20));
		this.add(button,gbc);
		
 	    
 	    this.setVisible(true);
 	    this.validate();
	}

	
}
