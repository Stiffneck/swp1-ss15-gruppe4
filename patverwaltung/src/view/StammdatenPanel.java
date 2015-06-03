package view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.time.format.DateTimeFormatter;

import javax.swing.JLabel;
import javax.swing.JTextField;

import model.Patient;

public class StammdatenPanel  {
//	private JLabel vornameL = new JLabel("Vorname:");
//	private JLabel nachnameL = new JLabel("Nachname:");
//	private JLabel geschlechtL = new JLabel("Geschlecht:");
//	private JLabel geburtstagL = new JLabel("Geburtstag:");
//
//	private JTextField vornameT = new JTextField(30);
//	private JTextField nachnameT = new JTextField(30);
//	private JTextField geschlechtT = new JTextField(30);
//	private JTextField geburtstagT = new JTextField(30);
//
//	public StammdatenPanel(Patient patient){
//		GridBagLayout gl = new GridBagLayout();
//		this.setLayout(gl);
//
//		GridBagConstraints gbc = Utility.makegbc(0, 1, 1, 1);
//		gbc.anchor = GridBagConstraints.EAST;
//		this.add(vornameL, gbc);
//		gbc = Utility.makegbc(1, 1, 1, 1);
//		this.add(vornameT, gbc);
//		vornameT.setText(patient.getVorname());
//		vornameT.setMinimumSize(new Dimension(150, 30));
//		gbc.anchor = GridBagConstraints.WEST;
//
//		gbc = Utility.makegbc(1, 0, 1, 1);
//		gbc.gridwidth = 2;
//		gbc.weightx = 2;
//		gbc.weighty = 2;
//		gbc.fill = GridBagConstraints.BOTH;
//		this.add(new ImagePanel(patient.getImage()), gbc);
//
//		gbc = Utility.makegbc(0, 2, 1, 1);
//		gbc.anchor = GridBagConstraints.EAST;
//		this.add(nachnameL, gbc);
//		gbc = Utility.makegbc(1, 2, 1, 1);
//		this.add(nachnameT, gbc);
//		nachnameT.setText(patient.getNachname());
//		nachnameT.setMinimumSize(new Dimension(150, 30));
//
//		gbc = Utility.makegbc(0, 3, 1, 1);
//		gbc.anchor = GridBagConstraints.EAST;
//		this.add(geschlechtL, gbc);
//		gbc = Utility.makegbc(1, 3, 1, 1);
//		this.add(geschlechtT, gbc);
//		geschlechtT.setText(patient.getGeschlecht());
//		geschlechtT.setMinimumSize(new Dimension(150, 30));
//
//		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//		gbc = Utility.makegbc(0, 4, 1, 1);
//		gbc.anchor = GridBagConstraints.EAST;
//		this.add(geburtstagL, gbc);
//		gbc = Utility.makegbc(1, 4, 1, 1);
//		this.add(geburtstagT, gbc);
//		geburtstagT.setText(sdf.format(patient.getGeburtstag()));
//		geburtstagT.setMinimumSize(new Dimension(150, 30));
//
//	}
//
//	private void setLayout(GridBagLayout gl) {
//		// TODO Auto-generated method stub
//		
//	}
//		
//	}

}
