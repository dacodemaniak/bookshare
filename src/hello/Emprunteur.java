/**
 * 
 */
package hello;

import hello.service.Parametre;

/**
 * @author jean-
 *
 */
public class Emprunteur extends Utilisateur {
	
	private int nbLivres;
	private int duree;
	
	public Emprunteur() {
		super();
		// TODO Auto-generated constructor stub
		this.nbLivres = 5;
		this.duree = 15;
	}

	public Emprunteur(String nom, String prenom, String numAdherent) {
		super(nom, prenom, numAdherent);
		// TODO Auto-generated constructor stub
		this.nbLivres = 5;
		this.duree = 15;
	}
	
	public double calcule() {
		return this.nbLivres * this.duree * Parametre.COUT_LOCATION;
	}
	
	public Utilisateur clone() {
		Loueur loueur = new Loueur();
		loueur.nom = this.nom;
		loueur.prenom = this.prenom;
		loueur.numAdherent = this.numAdherent;
		
		return loueur;
	}
}
