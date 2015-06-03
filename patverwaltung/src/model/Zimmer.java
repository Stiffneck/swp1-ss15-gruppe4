package model;

import java.util.ArrayList;

public class Zimmer {
private int anzahlBetten;
private int zimmerNummer;
private boolean freieBetten;
private ArrayList <Patient> liste;
	
	public Zimmer(){
		liste = new ArrayList<Patient>();
		
	}

	public int getAnzahlBetten() {
		return anzahlBetten;
	}

	public void setAnzahlBetten(int anzahlBetten) {
		this.anzahlBetten = anzahlBetten;
	}

	public int getZimmerNummer() {
		return zimmerNummer;
	}

	public void setZimmerNummer(int zimmerNummer) {
		this.zimmerNummer = zimmerNummer;
	}

	public boolean isFreieBetten() {
		return freieBetten;
	}

	public void setFreieBetten(boolean freieBetten) {
		this.freieBetten = freieBetten;
	}

	public void patientEntfernen(Patient patient){
		liste.remove(patient);
	}
	
	public void patientHinzufuegen(Patient patient){
		liste.add(patient);
	}
	
	
}
