package view;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VerlegungsDialog {
	public VerlegungsDialog(){
		String optionen [] = {"a","b","c"};
		String station = (String) JOptionPane.showInputDialog(null,"Station", "Verlegung",
				JOptionPane.QUESTION_MESSAGE,
				null, optionen, optionen[1] );
		System.out.println(station);
	}
}
