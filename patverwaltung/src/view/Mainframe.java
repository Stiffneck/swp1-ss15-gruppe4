package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

import model.Patient;

public class Mainframe extends JFrame {
	private Menuleiste menuleiste;
	private StationslistePanel stationslistepanel;
	private StationsauswahlPanel stationsauswahlpanel;
	private StammdatenPanel stammdatenpanel;
	private Patient patient;
	
	public Mainframe (){
		this.setTitle("Patientenverwaltung");
		this.setSize(1200, 700);
		this.setPreferredSize(new Dimension(900, 900));
		this.setBackground(Color.WHITE);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		stationslistepanel = new StationslistePanel(this);
		stationsauswahlpanel = new StationsauswahlPanel(this);
		menuleiste = new Menuleiste(this);
		stammdatenpanel = new StammdatenPanel(this,patient);
	}
/**
 * Zeigt die Oberfläche für die Ausgabe der patientenliste an
 */

public void showPatientliste(){
	//StationslistePanel
	this.getContentPane().remove(stammdatenpanel);
	this.getContentPane().remove(stationslistepanel);
	this.getContentPane().remove(stationsauswahlpanel);	
	this.pack();
	this.validate();
	this.getContentPane().add(stationslistepanel, BorderLayout.CENTER);
	this.getContentPane().add(stationsauswahlpanel, BorderLayout.NORTH);
	
	
}
/**
 * Zeigt die Oberflaeche fuer die Aufnahme eines Patienten an
 */
public void showPatientenaufnahme(){
	this.getContentPane().remove(stationslistepanel);
	this.getContentPane().remove(stationsauswahlpanel);	
	this.getContentPane().remove(stammdatenpanel);
	
	this.getContentPane().add(stammdatenpanel, BorderLayout.CENTER);
	this.pack();
	this.validate();
}
}
