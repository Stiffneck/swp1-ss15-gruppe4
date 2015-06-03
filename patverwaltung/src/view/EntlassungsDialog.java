package view;

import javax.swing.JOptionPane;

public class EntlassungsDialog {
	public EntlassungsDialog(){
		String optionen [] = {"Ja", "Nein"};
		int n = JOptionPane.showOptionDialog(null,
				"Möchten Sie den Patienten wirklich entlassen", 
				"Entlassung",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, optionen, optionen[0]);
       System.out.println(n);
       System.exit(0);
	}
}