package model;

import java.util.ArrayList;

public class StationsManager {
	private ArrayList<Station> stationsliste;
	
	public StationsManager()  {
		setStationsliste(new ArrayList<Station>());
	}

	public ArrayList<Station> getStationsliste() {
		return stationsliste;
	}

	public void setStationsliste(ArrayList<Station> stationsliste) {
		this.stationsliste = stationsliste;
	}

}
