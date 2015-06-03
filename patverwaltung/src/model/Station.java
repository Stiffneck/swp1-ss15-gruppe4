package model;

public class Station {
private int anzahlZimmer;
private String stationsName = "";
private int anzahlFreieZimmer;
	
	
	public Station(){
	
}


	public int getAnzahlZimmer() {
		return anzahlZimmer;
	}


	public void setAnzahlZimmer(int anzahlZimmer) {
		this.anzahlZimmer = anzahlZimmer;
	}


	public String getStationsName() {
		return stationsName;
	}


	public void setStationsName(String stationsName) {
		this.stationsName = stationsName;
	}


	public int getAnzahlFreieZimmer() {
		return anzahlFreieZimmer;
	}


	public void setAnzahlFreieZimmer(int anzahlFreieZimmer) {
		this.anzahlFreieZimmer = anzahlFreieZimmer;
	}

}
