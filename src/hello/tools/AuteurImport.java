/**
 * 
 */
package hello.tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author jean-
 *
 */
public class AuteurImport {
	private File auteurFile;
	
	private static final String FIELD_SEP = ";";
	
	private ArrayList<String[]> auteurs;
	
	// TODO Ajouter un moyen de définir si oui ou non il y a une ligne d'en-tête
	public AuteurImport() {
		// Instancier le ArrayList
		this.auteurs = new ArrayList<String[]>();
		
		// Instancier la classe File donc... créer l'objet auteurFile
		this.auteurFile = new File("c:\\devspace\\java\\hello\\auteurs.csv");
		if (this.auteurFile.exists()) {
			if (auteurFile.canRead()) {
				this.process();
			} else {
				System.out.println("Le fichier n'est pas lisible");
			}
		} else {
			System.out.println("Le fichier demandé n'existe pas");
		}
	}
	
	public ArrayList<String[]> getAuteurs() {
		return this.auteurs;
	}

	private void process() {
		// TODO Compter le nombre de colonnes dans une ligne lue
		try {
			Scanner fileScanner = new Scanner(this.auteurFile);
			
			int rowCount = 0;
			while(fileScanner.hasNext()) {
				String row = fileScanner.nextLine();
				if (rowCount > 0) {
					// On doit parser row...
					String[] cols = row.split(AuteurImport.FIELD_SEP);
					// On doit ranger le tableau dans un ArrayList
					this.auteurs.add(cols);
				}
				rowCount++;
			}
			
		} catch(IOException ioe) {
			/// Your logic here
		}
	}
}
