package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Mainframe extends JFrame {
	private Menuleiste menuleiste;
	private StationslistePanel stationslistepanel;
	private StationsauswahlPanel stationsauswahlpanel;
	public Mainframe (){
		this.setTitle("Patientenverwaltung");
		this.setSize(1200, 700);
		this.setPreferredSize(new Dimension(900, 900));
		this.setBackground(Color.WHITE);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		menuleiste = new Menuleiste(this);
		
	}
/**
 * Zeigt die Oberfläche für die Ausgabe der patientenliste an
 */

public void showPatientliste(){
	//StationslistePanel
	stationslistepanel = new StationslistePanel(this);
	stationsauswahlpanel = new StationsauswahlPanel(this);
	clear();
	this.getContentPane().add(stationslistepanel, BorderLayout.CENTER);
	this.getContentPane().add(stationsauswahlpanel, BorderLayout.NORTH);
	
	
}
/**
 * Leert die Patientendaten und das EKG
 */
protected void clear() {
	
	this.getContentPane().remove(stationslistepanel);
	this.getContentPane().remove(stationsauswahlpanel);

	this.pack();
	this.validate();
}
}
