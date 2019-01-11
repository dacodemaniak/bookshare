/**
 * 
 */
package hello.ihm;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;

import hello.ihm.button.MyButton;
import hello.ihm.list.MyList;
import hello.service.ToArray;
import hello.tools.AuteurImport;

/**
 * @author jean-
 *
 */
public class MyApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame mainWindow = new MainApp();
		
		// Changer la couleur de la fenêtre
		Color color = Color.DARK_GRAY;
		((MainApp) mainWindow).changeBackgroundColor(color);
		
		// Et si on ajoutait un bouton ?
		MyButton button = new MyButton();
		button.setButtonCaption("Show Authors");
		
		MyButton button2 = new MyButton();
		button2.setButtonCaption("Autre bouton");
		
		((MainApp) mainWindow).addButton(button);
		((MainApp) mainWindow).addButton(button2);
		
		// Je récupère la liste des auteurs
		AuteurImport importAuteur = new AuteurImport();
		ArrayList<String[]> lesAuteurs = importAuteur.getAuteurs();
		
		MyList auteurListe = new MyList(ToArray.toArray(lesAuteurs));
		((MainApp) mainWindow).addListe(auteurListe);
		
		mainWindow.setVisible(true);
		
	}

}
