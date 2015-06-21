package view;

import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;



public class Menuleiste extends MenuBar {
	
	private Mainframe mainframe;
	private JMenuItem datei,patient,hilfe;
	private String info;
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
		aufnehmen.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//methode zum Anzeigen des StationslistePanels
				mainframe.showPatientenaufnahme();
			}
		});
		patient.add(aufnehmen);
		
		JMenuItem listeausgeben = new JMenuItem("Liste ausgeben");
		listeausgeben.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//methode zum Anzeigen des StationslistePanels
				mainframe.showPatientliste();
			}
		});
		patient.add(listeausgeben);
		
		JMenuItem verlegen = new JMenuItem("Verlegen");
		patient.add(verlegen);
		
		JMenuItem entlassen = new JMenuItem("Entassen");
		patient.add(entlassen);
		
		JMenuItem help = new JMenuItem("Hilfe anzeigen");
		help.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				String res = "Nicht verfuegbar";
				JOptionPane.showMessageDialog(mainframe,res, info,
							JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		hilfe.add(help);
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
