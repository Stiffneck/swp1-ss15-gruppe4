package view;

import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menuleiste extends MenuBar {
	private Mainframe mainframe;
	private JMenuItem datei,patient,hilfe;
	public Menuleiste(Mainframe mainframe){
		this.setMainframe(mainframe);
	//MenuBar
		JMenuBar bar = new JMenuBar();
	
	//Menueintraege
		datei = new JMenu("Datei");
		patient = new JMenu ("Patient");
		hilfe = new JMenu ("Hilfe");
	//Buttons
		JMenuItem beenden = new JMenuItem("Beenden");
		beenden.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
		datei.add(beenden);
		
		JMenuItem suchen = new JMenuItem("Suchen");
		patient.add(suchen);
		
		JMenuItem aufnehmen = new JMenuItem("Aufnehmen");
		patient.add(aufnehmen);
		
		JMenuItem listeausgeben = new JMenuItem("Liste ausgeben");
		listeausgeben.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//methode
			}
		});
		patient.add(listeausgeben);
		
		JMenuItem verlegen = new JMenuItem("Verlegen");
		patient.add(verlegen);
		
		JMenuItem entlassen = new JMenuItem("Entassen");
		patient.add(entlassen);
		
	//Eintraege zum MenuBar hinzufuegen
		bar.add(datei);
		bar.add(patient);
		bar.add(hilfe);
		
		
		mainframe.setJMenuBar(bar);
		bar.setVisible(true);
		
	}
	public Mainframe getMainframe() {
		return mainframe;
	}
	public void setMainframe(Mainframe mainframe) {
		this.mainframe = mainframe;
	}
		
}
