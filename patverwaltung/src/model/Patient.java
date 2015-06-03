package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//import javax.swing.ImageIcon;

public class Patient {
	// DateTimeFormatter
		private static final DateTimeFormatter df = DateTimeFormatter
				.ofPattern("dd.MM.yyyy");
	
	
	//Patientendaten
			private String vorname = "";
			private String nachname = "";
			private String strasse = "";
			private String hausnr = "";
			private String stadt = "";
			private int plz = 0;
			private char geschlecht = 'm';
			private LocalDate geburtstag = LocalDate.parse("01.01.1900", df);
			private int alter;
			// Versicherung
			private String versicherungs_name = "";
			private int versicherungs_nummer;
			private boolean privat = false;
	public Patient (){
		
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getHausnr() {
		return hausnr;
	}
	public void setHausnr(String hausnr) {
		this.hausnr = hausnr;
	}
	public String getStadt() {
		return stadt;
	}
	public void setStadt(String stadt) {
		this.stadt = stadt;
	}
	public int getPlz() {
		return plz;
	}
	public void setPlz(int plz) {
		this.plz = plz;
	}
	public char getGeschlecht() {
		return geschlecht;
	}
	public void setGeschlecht(char geschlecht) {
		this.geschlecht = geschlecht;
	}
	public LocalDate getGeburtstag() {
		return geburtstag;
	}
	public void setGeburtstag(LocalDate geburtstag) {
		this.geburtstag = geburtstag;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public String getVersicherungs_name() {
		return versicherungs_name;
	}
	public void setVersicherungs_name(String versicherungs_name) {
		this.versicherungs_name = versicherungs_name;
	}
	public int getVersicherungs_nummer() {
		return versicherungs_nummer;
	}
	public void setVersicherungs_nummer(int versicherungs_nummer) {
		this.versicherungs_nummer = versicherungs_nummer;
	}
	public boolean isPrivat() {
		return privat;
	}
	public void setPrivat(boolean privat) {
		this.privat = privat;
	}
	public Object getImage() {
		// TODO Auto-generated method stub
		return null;
	}
}
