/**
 * 
 */
package hello.utilisateurs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import hello.livre.Auteur;
import hello.livre.Livre;
import hello.livre.exceptions.BirthdateException;
import hello.tools.AuteurImport;
/**
 * @author jean-
 *
 */
public class CreateUsers {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	private static ArrayList<Auteur> listeAuteurs;
	
	public static void main(String[] args) throws ParseException, BirthdateException {
		// TODO Auto-generated method stub
		Utilisateur loueur = createLoueur();
		Utilisateur emprunteur = CreateUsers.createEmprunteur();
		Utilisateur emprunteurLoueur = createEmprunteurLoueur();
		
		if (loueur instanceof Loueur) {
			System.out.println(loueur.nom() + " est un loueur");
		}
		
		if (emprunteur instanceof Loueur) {
			System.out.println(emprunteur.nom() + " est un loueur");
		} else {
			System.out.println(emprunteur.nom() + " n'est pas un loueur");
		}

		if (emprunteurLoueur instanceof EmprunteurLoueur) {
			System.out.println(emprunteurLoueur.nom() + " est un loueur et un emprunteur");
		}
		
		// Créer un Livre
		Livre livre = new Livre();
		livre.titre("Les Misérables")
			.resume("Blah blah blah")
			.nbPages(520);
		((Loueur) loueur)
			.addBook(livre);
		((Loueur) loueur)
			.addBook(livre);
		System.out.println(((Loueur) loueur).listBooks());
		
		Loueur moi = (Loueur) createLoueur();
		moi.nom("Casper")
			.prenom("Le Fantôme")
			.numAdherent("00022225555");
		System.out.println(moi.listBooks());
		
		// Création d'un auteur
		// Use case 1 : à la main
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse("1802-01-02");
		Auteur hugo = Auteur.getAuteur("Hugo", "Victor", date);
		hugo.insert();
		
		// Use case 2 : par la ligne de commande
		/*
		try {
			Auteur asimov = Auteur.getAuteur();
			System.out.println(asimov.getNom());
		} catch(ParseException parseException) {
			System.out.println("La date de naissance est incorrecte");
			System.out.println(parseException.getLocalizedMessage());
		} catch(BirthdateException naissance) {
			System.out.println(naissance.getMessage());
		}
		*/
		//Auteur asimov = Auteur.getAuteur();
		
		// Créer les auteurs à partir d'un fichier délimité
		AuteurImport auteurs = new AuteurImport();
		
		// Récupèrer la liste des auteurs
		
		// Boucler sur la liste des auteurs
		for (String[] unAuteur : auteurs.getAuteurs()) {
			try {
				SimpleDateFormat leFormat = new SimpleDateFormat("yyyy-MM-dd");
				Date laDate = format.parse(unAuteur[2]);
				listeAuteurs.add(Auteur.getAuteur(unAuteur[0], unAuteur[1], laDate));
				
			} catch(Exception e) {
				// NOOP
			}
		}
	}
	
	private static Utilisateur createLoueur() {
		return new Loueur()
				.nom("Aubert")
				.prenom("Jean-Luc")
				.numAdherent("000111555");
	}
	
	private static Utilisateur createEmprunteur() {
		return new Emprunteur()
				.nom("Talaron")
				.prenom("Delphine")
				.numAdherent("000555666");
	}
	
	private static Utilisateur createEmprunteurLoueur() {
		return new EmprunteurLoueur()
				.nom("Sakolsanscotcz")
				.prenom("Nicole")
				.numAdherent("333666999");
	}

}
