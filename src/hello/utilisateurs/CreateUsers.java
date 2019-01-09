/**
 * 
 */
package hello.utilisateurs;

import hello.livre.Livre;

/**
 * @author jean-
 *
 */
public class CreateUsers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
