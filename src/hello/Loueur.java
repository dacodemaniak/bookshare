/**
 * 
 */
package hello;

import hello.service.Parametre;

/**
 * @author jean-
 *
 */
public final class Loueur extends Utilisateur {
	private int nbLivres;
	
	/**
	 * 
	 */
	public Loueur() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param numAdherent
	 */
	public Loueur(String nom, String prenom, String numAdherent) {
		super(nom, prenom, numAdherent);
		// TODO Auto-generated constructor stub
	}
	
	public Loueur nbLivres(int nbLivres) {
		this.nbLivres = nbLivres;
		return this;
	}
	
	public int nbLivres() {
		return this.nbLivres;
	}
	
	public double calculeCotisation() {
		if (this.nbLivres < Parametre.NB_LIVRES_MINI) {
			this.cotisation = Parametre.MONTANT_COTISATION;
		} else {
			this.cotisation = Parametre.MONTANT_COTISATION - (1 + Parametre.TX_REMISE);
		}
		
		return this.cotisation;
	}
	
	public Utilisateur clone() {
		Emprunteur emprunteur = new Emprunteur();
		emprunteur.nom = this.nom;
		emprunteur.prenom = this.prenom;
		emprunteur.numAdherent = this.numAdherent;
		
		return emprunteur;
	}

}
