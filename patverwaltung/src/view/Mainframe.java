package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Mainframe extends JFrame {
	private Menuleiste menuleiste;
	private StationslistePanel stationslistepanel;
	
	public Mainframe (){
		this.setTitle("Patientenverwaltung");
		this.setSize(1200, 700);
		this.setPreferredSize(new Dimension(900, 900));
		this.setBackground(Color.WHITE);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		menuleiste = new Menuleiste(this);
		
		//StationslistePanelgd
		stationslistepanel = new StationslistePanel(this);
		this.getContentPane().add(stationslistepanel, BorderLayout.SOUTH);
	}
}
