/**
 * 
 */
package hello.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import hello.livre.Auteur;

/**
 * @author jean-
 *
 */
public class ToArray {
	public static String[] toArray(ArrayList<String[]> auteurs) {
		Auteur[] lesAuteurs = new Auteur[auteurs.size()];
		
		int indice = 0;
		
		for (String[] auteur : auteurs) {
			try {
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				Date laDate = format.parse(auteur[2]);
				lesAuteurs[indice] = Auteur.getAuteur(auteur[0], auteur[1], laDate);
				indice++;
			} catch(Exception e) {
				// NOOP
			}			
		}
		
		String[] toString = new String[auteurs.size()];
		for (int i = 0; i < lesAuteurs.length; i++) {
			toString[i] = lesAuteurs[i].getNom() + " " + lesAuteurs[i].getPrenom();
		}
		
		return toString;
	}
}
