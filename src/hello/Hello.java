/**
 * 
 */
package hello;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import hello.livre.Auteur;
import hello.livre.Livre;

/**
 * @author jean-
 *
 */
public class Hello {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		
		Utilisateur moi = new Loueur();
		moi.setNom("Tartempion");
		moi.setPrenom("Jules");
		moi.setNumAdherent("5722001");
		
		System.out.println("Utilisateur : " + moi.getNom());
		
		Utilisateur lui = new Loueur("Bond", "James", "007");
		
		System.out.println("My name is : " + lui.getNom());
		
		Utilisateur alien = new Loueur();
		alien
			.nom("ET")
			.prenom("Dvorak")
			.numAdherent("777888999");
		((Loueur) alien).nbLivres(15); // Cast de variable
		
		System.out.println("Retour maison : " + alien.nom());
		
		// Clone un loueur pour en faire un emprunteur
		Utilisateur emprunteurAlien = alien.clone();
		System.out.println("Emprunteur " + emprunteurAlien.getNom() + " : " + ((Emprunteur) emprunteurAlien).calcule());
		// Création d'un bouquin
		Livre lesMiserables = new Livre();
		lesMiserables
			.titre("Les Misérables")
			.resume("Long, chiant et pleurnichard...")
			.nbPages(12800);
		
		Livre fondation = new Livre("Fondation", "Je ne l'ai pas lu", 350);
		
		System.out.println("Fondation : " + fondation.nbPages());
		
		// Auteur ?
		@SuppressWarnings("deprecation")

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse("1802-01-02");
		Auteur hugo = Auteur.getAuteur("Hugo", "Victor", date);
		if (hugo == null) {
			System.out.println("Impossible d'instancier hugo");
		} else {
			System.out.println("Auteur " + hugo.getNom());
		}
		
	}

}
