package view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Patient;
import view.Utility;
import view.Mainframe;

public class StationslistePanel extends JPanel {
	private Mainframe mainframe;
	private Patient patient;
	
	private static final DateTimeFormatter df = DateTimeFormatter
			.ofPattern("dd.MM.yyyy");
	
	
	private JLabel vornameLabel;
	private JLabel nachnameLabel;
	

	private JTextField vornameTField;
	private JTextField nachnameTField;
	
	private String fehler, keinPatientgeoeffnet, patientendatenunvollstaendig;
	public StationslistePanel(Mainframe mainframe){
		this.setBackground(Color.WHITE);
		
		this.mainframe = mainframe;
		//StationsauswahlPanel
		
		// Layout-Manager definieren
				GridBagLayout gbl = new GridBagLayout();
				this.setLayout(gbl);

				// Patientendaten definieren, layouten und zum Container

				GridBagConstraints gbc = Utility.makeGbc(0, 0, 2, 1,GridBagConstraints.EAST,GridBagConstraints.HORIZONTAL);
				vornameLabel = new JLabel("Vorname: ");
				this.add(vornameLabel, gbc);

				gbc = Utility.makeGbc(1, 0, 1, 1, GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL);
				vornameTField = new JTextField(20);
				this.add(vornameTField, gbc);

				gbc = Utility.makeGbc(0, 1, 1, 1, GridBagConstraints.EAST,
						GridBagConstraints.HORIZONTAL);
				nachnameLabel = new JLabel("");
				this.add(nachnameLabel, gbc);

				gbc = Utility.makeGbc(1, 1, 1, 1, GridBagConstraints.WEST,
						GridBagConstraints.HORIZONTAL);
				nachnameTField = new JTextField(20);
				this.add(nachnameTField, gbc);

				
				// Anpassung der Groesse
				this.validate();
			
		
	}
 
	/**
	 * Zeigt die Daten des Patienten im Panel an
	 */
	private void showPatient(){
	 patient.setVorname(vornameTField.getText());
		patient.setNachname(nachnameTField.getText());
		
		
}
}
