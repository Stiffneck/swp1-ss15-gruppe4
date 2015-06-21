package view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



import view.Utility;
import model.Patient;

public class StammdatenPanel extends JPanel  {
	
	private static final DateTimeFormatter df = DateTimeFormatter
			.ofPattern("dd.MM.yyyy");
	
	private JLabel vornameL = new JLabel("Vorname:");
	private JLabel nachnameL = new JLabel("Nachname:");
	private JLabel strasseL = new JLabel("Straﬂe:");
	private JLabel hausnummerL = new JLabel("Hausnummer:");
	private JLabel stadtL = new JLabel("Stadt:");
	private JLabel plzL = new JLabel("PLZ:");
	private JLabel geschlechtL = new JLabel("Geschlecht:");
	private JLabel geburtstagL = new JLabel("Geburtstag:");
	private JLabel alterL = new JLabel("Alter:");
	private JLabel versicherungs_nameL = new JLabel("Versicherungsname:");
	private JLabel versicherungs_nummerL = new JLabel("Versicherungsnummer:");
	private JLabel privatL = new JLabel("Privat:");

	private JTextField vornameT = new JTextField(30);
	private JTextField nachnameT = new JTextField(30);
	private JTextField strasseT = new JTextField(30);
	private JTextField hausnummerT = new JTextField(30);
	private JTextField stadtT = new JTextField(30);
	private JTextField plzT = new JTextField(30);
	private JTextField geschlechtT = new JTextField(30);
	private JTextField geburtstagT = new JTextField(30);
	private JTextField alterT = new JTextField(30);
	private JTextField versicherungs_nameT = new JTextField(30);
	private JTextField versicherungs_nummerT = new JTextField(30);
	private JTextField privatT = new JTextField(30);
	private String fehler, patientendatenunvollstaendig;
	private Mainframe mainframe;
	private Patient patient;
	private JButton button;
	public StammdatenPanel(Mainframe mainframe,Patient patient){
		this.mainframe = mainframe;
		GridBagLayout gl = new GridBagLayout();
		this.setLayout(gl);

		GridBagConstraints gbc = Utility.makeGbc(0, 1, 1, 1,GridBagConstraints.EAST,GridBagConstraints.HORIZONTAL);
		this.add(vornameL, gbc);
		gbc = Utility.makeGbc(1, 1, 1, 1,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL);
		this.add(vornameT, gbc);

		
		gbc = Utility.makeGbc(0, 2, 1, 1,GridBagConstraints.EAST,GridBagConstraints.HORIZONTAL);
		this.add(nachnameL, gbc);
		gbc = Utility.makeGbc(1, 2, 1, 1,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL);
		this.add(nachnameT, gbc);

		
		gbc = Utility.makeGbc(0, 3, 1, 1,GridBagConstraints.EAST,GridBagConstraints.HORIZONTAL);
		this.add(strasseL, gbc);
		gbc = Utility.makeGbc(1, 2, 1, 1,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL);
		this.add(strasseT, gbc);

		
		gbc = Utility.makeGbc(0, 3, 1, 1,GridBagConstraints.EAST,GridBagConstraints.HORIZONTAL);
		this.add(hausnummerL, gbc);
		gbc = Utility.makeGbc(1, 2, 1, 1,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL);
		this.add(hausnummerT, gbc);

		
		gbc = Utility.makeGbc(0, 4, 1, 1,GridBagConstraints.EAST,GridBagConstraints.HORIZONTAL);
		this.add(stadtL, gbc);
		gbc = Utility.makeGbc(1, 2, 1, 1,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL);
		this.add(stadtT, gbc);

		
		gbc = Utility.makeGbc(0, 5, 1, 1,GridBagConstraints.EAST,GridBagConstraints.HORIZONTAL);
		this.add(plzL, gbc);
		gbc = Utility.makeGbc(1, 2, 1, 1,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL);
		this.add(plzT, gbc);



		gbc = Utility.makeGbc(0, 6, 1, 1,GridBagConstraints.EAST,GridBagConstraints.HORIZONTAL);
		this.add(geschlechtL, gbc);
		gbc = Utility.makeGbc(1, 3, 1, 1,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL);
		this.add(geschlechtT, gbc);


		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		gbc = Utility.makeGbc(0, 6, 1, 1,GridBagConstraints.EAST,GridBagConstraints.HORIZONTAL);
		this.add(geburtstagL, gbc);
		gbc = Utility.makeGbc(1, 4, 1, 1,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL);
		this.add(geburtstagT, gbc);

		
		gbc = Utility.makeGbc(0, 7, 1, 1,GridBagConstraints.EAST,GridBagConstraints.HORIZONTAL);
		this.add(alterL, gbc);
		gbc = Utility.makeGbc(1, 2, 1, 1,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL);
		this.add(alterT, gbc);

		
		gbc = Utility.makeGbc(0, 8, 1, 1,GridBagConstraints.EAST,GridBagConstraints.HORIZONTAL);
		this.add(versicherungs_nameL, gbc);
		gbc = Utility.makeGbc(1, 8, 1, 1,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL);
		this.add(versicherungs_nameT, gbc);


		gbc = Utility.makeGbc(0, 9, 1, 1,GridBagConstraints.EAST,GridBagConstraints.HORIZONTAL);
		this.add(versicherungs_nummerL, gbc);
		gbc = Utility.makeGbc(1, 9, 1, 1,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL);
		this.add(versicherungs_nummerT, gbc);


		gbc = Utility.makeGbc(0, 10, 1, 1,GridBagConstraints.EAST,GridBagConstraints.HORIZONTAL);
		this.add(privatL, gbc);
		gbc = Utility.makeGbc(1, 10, 1, 1,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL);
		this.add(privatT, gbc);
		
		gbc = Utility.makeGbc(0, 12, 1, 1,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL);
		button = new JButton("Ok");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//methode zum Anzeigen aller Patienten
				
			}
		});
 	    this.add(button,gbc);
 	   gbc = Utility.makeGbc(1, 12, 1, 1,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL);
		button = new JButton("Abbrechen");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//methode zum Anzeigen aller Patienten
				
			}
		});
	    this.add(button,gbc);
		this.validate();
		
	}
	
	/**
	 *  Speichert die in der Oberflaeche eingegebenen Patientendaten
	 * @param patient
	 * @throws IOException
	 */
	private void savePatientData(Patient patient) throws IOException {

		try {
			patient.setVorname(vornameT.getText());
			patient.setNachname(nachnameT.getText());
			patient.setGeschlecht(geschlechtT.getText().charAt(0));
			patient.setGeburtstag(LocalDate.parse(
						geburtstagT.getText(), df));
			patient.setStrasse(strasseT.getText());
			patient.setHausnr(hausnummerT.getText());
			patient.setStadt(stadtT.getText());
			patient.setPlz(Integer.parseInt(plzT.getText()));

		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null,
					patientendatenunvollstaendig, fehler,
					JOptionPane.INFORMATION_MESSAGE);
		}

	}
	private void setLayout(GridBagLayout gl) {
		// TODO Auto-generated method stub
		
	}
}	
	


