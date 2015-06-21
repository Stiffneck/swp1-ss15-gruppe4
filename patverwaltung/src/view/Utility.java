package view;

import java.awt.GridBagConstraints;
import java.awt.Insets;
/**
 * Mit der Klasse {@link Utility} werden Rahmen für die Objekte in einem
 * GridBagLayout erzeugt.
 * 
 * @author Selen Keskincelik, Hanni Hawa
 *
 */
public class Utility {
	/**
	 * Diese Methode erzeugt die Constraints fuer die Objekte in einem
	 * GridBagLayout.
	 * 
	 * @param x
	 *            Spalte des Grafikobjekts
	 * @param y
	 *            Zeile des Grafikobjekts
	 * @param width
	 *            Breite des Grafikobjekts
	 * @param height
	 *            Hoehe des Grafikobjekts
	 * @return GridBagConstraints fuer das jeweilige Grafikobjekt
	 */
	static public GridBagConstraints makeGbc(int x, int y, int width, int height, int anchor,int fill) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = width;
		gbc.gridheight = height;
		gbc.anchor = anchor;
		gbc.fill = fill;
		
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.insets = new Insets(1, 1, 1, 1);
		gbc.ipadx = 1;
		gbc.ipady = 0;
		return gbc;
	}
}