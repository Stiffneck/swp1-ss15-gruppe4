package view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Locale;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import view.Utility;
import view.Mainframe;

public class StationslistePanel extends JPanel {
	private Mainframe mainframe;

	private Locale currentLocale;
	private JLabel vornameLabel;
	private JLabel nachnameLabel;
	private JLabel strasseLabel;
	private JLabel hausnrLabel;
	private JLabel stadtLabel;
	private JLabel plzLabel;
	private JLabel geschlechtLabel;
	private JLabel geburtstagLabel;

	private JTextField vornameTField;
	private JTextField nachnameTField;
	private JTextField strasseTField;
	private JTextField hausnrTField;
	private JTextField stadtTField;
	private JTextField plzTField;
	private JTextField geschlechtTField;
	private JTextField geburtstagTField;
	
	private String fehler, keinPatientgeoeffnet, patientendatenunvollstaendig;
	public StationslistePanel(Mainframe mainframe){
		this.setBackground(Color.WHITE);
		
		this.mainframe = mainframe;
		//StationsauswahlPanel
		
		// Layout-Manager definieren
				GridBagLayout gbl = new GridBagLayout();
				this.setLayout(gbl);

				// Patientendaten definieren, layouten und zum Container

				GridBagConstraints gbc = Utility.makegbc(0, 0, 1, 1);
				gbc.anchor = GridBagConstraints.EAST;
				//gbc.anchor = GridBagConstraints.HORIZONTAL;
				vornameLabel = new JLabel("Vorname: ");
				this.add(vornameLabel, gbc);

				gbc = Utility.makegbc(1, 0, 1, 1);
				gbc.anchor = GridBagConstraints.WEST;
				//gbc.anchor = GridBagConstraints.HORIZONTAL;
				vornameTField = new JTextField(20);
				this.add(vornameTField, gbc);

//				gbc = Utility.makegbc(0, 1, 1, 1, GridBagConstraints.EAST,
//						GridBagConstraints.HORIZONTAL);
//				nachnameLabel = new JLabel("");
//				this.add(nachnameLabel, gbc);
//
//				gbc = Utility.makegbc(1, 1, 1, 1, GridBagConstraints.WEST,
//						GridBagConstraints.HORIZONTAL);
//				nachnameTField = new JTextField(20);
//				this.add(nachnameTField, gbc);
//
//				gbc = Utility.makegbc(0, 2, 1, 1, GridBagConstraints.EAST,
//						GridBagConstraints.HORIZONTAL);
//				strasseLabel = new JLabel("");
//				this.add(strasseLabel, gbc);
//
//				gbc = Utility.makegbc(1, 2, 1, 1, GridBagConstraints.WEST,
//						GridBagConstraints.HORIZONTAL);
//				strasseTField = new JTextField(20);
//				this.add(strasseTField, gbc);
//
//				gbc = Utility.makegbc(0, 3, 1, 1, GridBagConstraints.EAST,
//						GridBagConstraints.HORIZONTAL);
//				hausnrLabel = new JLabel("");
//				this.add(hausnrLabel, gbc);
//
//				gbc = Utility.makegbc(1, 3, 1, 1, GridBagConstraints.WEST,
//						GridBagConstraints.HORIZONTAL);
//				hausnrTField = new JTextField(5);
//				this.add(hausnrTField, gbc);
//
//				gbc = Utility.makegbc(0, 4, 1, 1, GridBagConstraints.EAST,
//						GridBagConstraints.HORIZONTAL);
//				stadtLabel = new JLabel("");
//				this.add(stadtLabel, gbc);
//
//				gbc = Utility.makegbc(1, 4, 1, 1, GridBagConstraints.WEST,
//						GridBagConstraints.HORIZONTAL);
//				stadtTField = new JTextField(20);
//				this.add(stadtTField, gbc);
//
//				gbc = Utility.makegbc(0, 5, 1, 1, GridBagConstraints.EAST,
//						GridBagConstraints.HORIZONTAL);
//				plzLabel = new JLabel("");
//				this.add(plzLabel, gbc);
//
//				gbc = Utility.makegbc(1, 5, 1, 1, GridBagConstraints.WEST,
//						GridBagConstraints.HORIZONTAL);
//				plzTField = new JTextField(5);
//				this.add(plzTField, gbc);
//
//				gbc = Utility.makegbc(0, 6, 1, 1, GridBagConstraints.EAST,
//						GridBagConstraints.HORIZONTAL);
//				geschlechtLabel = new JLabel("");
//				this.add(geschlechtLabel, gbc);
//
//				gbc = Utility.makegbc(1, 6, 1, 1, GridBagConstraints.WEST,
//						GridBagConstraints.HORIZONTAL);
//				geschlechtTField = new JTextField(1);
//				this.add(geschlechtTField, gbc);
//
//				gbc = Utility.makegbc(0, 7, 1, 1, GridBagConstraints.EAST,
//						GridBagConstraints.HORIZONTAL);
//				geburtstagLabel = new JLabel("");
//				this.add(geburtstagLabel, gbc);
//
//				gbc = Utility.makegbc(1, 7, 1, 1, GridBagConstraints.WEST,
//						GridBagConstraints.HORIZONTAL);
//				geburtstagTField = new JTextField(10);
//				this.add(geburtstagTField, gbc);

				// Anpassung der Groesse
				this.validate();

		
	}

}
