package view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.time.format.DateTimeFormatter;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import view.Utility;
import model.Patient;

public class StammdatenPanel extends JPanel  {
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

	public StammdatenPanel(Patient patient){
		GridBagLayout gl = new GridBagLayout();
		this.setLayout(gl);

		GridBagConstraints gbc = Utility.makegbc(0, 1, 1, 1);
		gbc.anchor = GridBagConstraints.EAST;
		this.add(vornameL, gbc);
		gbc = Utility.makegbc(1, 1, 1, 1);
		this.add(vornameT, gbc);
		vornameT.setText(patient.getVorname());
		vornameT.setMinimumSize(new Dimension(150, 30));
		gbc.anchor = GridBagConstraints.WEST;


		gbc = Utility.makegbc(0, 2, 1, 1);
		gbc.anchor = GridBagConstraints.EAST;
		this.add(nachnameL, gbc);
		gbc = Utility.makegbc(1, 2, 1, 1);
		this.add(nachnameT, gbc);
		nachnameT.setText(patient.getNachname());
		nachnameT.setMinimumSize(new Dimension(150, 30));
		
		gbc = Utility.makegbc(0, 3, 1, 1);
		gbc.anchor = GridBagConstraints.EAST;
		this.add(strasseL, gbc);
		gbc = Utility.makegbc(1, 2, 1, 1);
		this.add(strasseT, gbc);
		strasseT.setText(patient.getNachname());
		strasseT.setMinimumSize(new Dimension(150, 30));
		
		gbc = Utility.makegbc(0, 3, 1, 1);
		gbc.anchor = GridBagConstraints.EAST;
		this.add(hausnummerL, gbc);
		gbc = Utility.makegbc(1, 2, 1, 1);
		this.add(hausnummerT, gbc);
		hausnummerT.setText(patient.getNachname());
		hausnummerT.setMinimumSize(new Dimension(150, 30));
		
		gbc = Utility.makegbc(0, 4, 1, 1);
		gbc.anchor = GridBagConstraints.EAST;
		this.add(stadtL, gbc);
		gbc = Utility.makegbc(1, 2, 1, 1);
		this.add(stadtT, gbc);
		stadtT.setText(patient.getNachname());
		stadtT.setMinimumSize(new Dimension(150, 30));
		
		gbc = Utility.makegbc(0, 5, 1, 1);
		gbc.anchor = GridBagConstraints.EAST;
		this.add(plzL, gbc);
		gbc = Utility.makegbc(1, 2, 1, 1);
		this.add(plzT, gbc);
		plzT.setText(patient.getNachname());
		plzT.setMinimumSize(new Dimension(150, 30));


		gbc = Utility.makegbc(0, 6, 1, 1);
		gbc.anchor = GridBagConstraints.EAST;
		this.add(geschlechtL, gbc);
		gbc = Utility.makegbc(1, 3, 1, 1);
		this.add(geschlechtT, gbc);
		geschlechtT.setText(""+patient.getGeschlecht());
		geschlechtT.setMinimumSize(new Dimension(150, 30));

		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		gbc = Utility.makegbc(0, 6, 1, 1);
		gbc.anchor = GridBagConstraints.EAST;
		this.add(geburtstagL, gbc);
		gbc = Utility.makegbc(1, 4, 1, 1);
		this.add(geburtstagT, gbc);
		geburtstagT.setText(sdf.format(patient.getGeburtstag()));
		geburtstagT.setMinimumSize(new Dimension(150, 30));
		
		gbc = Utility.makegbc(0, 7, 1, 1);
		gbc.anchor = GridBagConstraints.EAST;
		this.add(alterL, gbc);
		gbc = Utility.makegbc(1, 2, 1, 1);
		this.add(alterT, gbc);
		alterT.setText(patient.getNachname());
		alterT.setMinimumSize(new Dimension(150, 30));
		
		gbc = Utility.makegbc(0, 8, 1, 1);
		gbc.anchor = GridBagConstraints.EAST;
		this.add(versicherungs_nameL, gbc);
		gbc = Utility.makegbc(1, 8, 1, 1);
		this.add(versicherungs_nameT, gbc);
		versicherungs_nameT.setText(patient.getVersicherungs_name());
		versicherungs_nameT.setMinimumSize(new Dimension(150, 30));

		gbc = Utility.makegbc(0, 9, 1, 1);
		gbc.anchor = GridBagConstraints.EAST;
		this.add(versicherungs_nummerL, gbc);
		gbc = Utility.makegbc(1, 9, 1, 1);
		this.add(versicherungs_nummerT, gbc);
		versicherungs_nummerT.setText(""+patient.getVersicherungs_nummer());
		versicherungs_nummerT.setMinimumSize(new Dimension(150, 30));

		gbc = Utility.makegbc(0, 10, 1, 1);
		gbc.anchor = GridBagConstraints.EAST;
		this.add(privatL, gbc);
		gbc = Utility.makegbc(1, 10, 1, 1);
		this.add(privatT, gbc);
		privatT.setText(patient.isPrivat() + "");
		privatT.setMinimumSize(new Dimension(150, 30));

	}

//	private void setLayout(GridBagLayout gl) {
		// TODO Auto-generated method stub
		
	}
		
	


