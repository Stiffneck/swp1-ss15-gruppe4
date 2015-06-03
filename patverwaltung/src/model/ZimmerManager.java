package model;

import java.util.ArrayList;

public class ZimmerManager {
	private ArrayList<Zimmer> zimmerliste;
	private ArrayList<Station> freiezimmerliste;
	
	public ZimmerManager(){
		
	}

	public ArrayList<Zimmer> getZimmerliste() {
		return zimmerliste;
	}

	public void setZimmerliste(ArrayList<Zimmer> zimmerliste) {
		this.zimmerliste = zimmerliste;
	}

	public ArrayList<Station> getFreiezimmerliste() {
		return freiezimmerliste;
	}

	public void setFreiezimmerliste(ArrayList<Station> freiezimmerliste) {
		this.freiezimmerliste = freiezimmerliste;
	}

}
