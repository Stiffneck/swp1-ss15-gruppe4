package model;

import java.util.ArrayList;

public class PatientenManager {
	private ArrayList<Patient> patientenliste;


public PatientenManager(){
	patientenliste = new ArrayList<Patient>();
}


public ArrayList<Patient> getPatientenliste() {
	return patientenliste;
}


public void setPatientenliste(ArrayList<Patient> patientenliste) {
	this.patientenliste = patientenliste;
}
}