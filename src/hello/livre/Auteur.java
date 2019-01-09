/**
 * 
 */
package hello.livre;

import java.util.Date;

/**
 * @author jean-
 *
 */
public class Auteur {
	private String nom;
	
	private String prenom;
	
	private Date naissance;

	private Auteur(String nom, String prenom, Date naissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.naissance = naissance;
	}
	
	public static Auteur getAuteur(String nom, String prenom, Date naissance) {
		Date today = new Date();
		if (naissance.after(today)) {
			return null;
		}
		
		Auteur auteur = new Auteur(nom, prenom, naissance);
		return auteur;
	}
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public Auteur setNom(String nom) {
		this.nom = nom;
		return this;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public Auteur setPrenom(String prenom) {
		this.prenom = prenom;
		return this;
	}

	/**
	 * @return the naissance
	 */
	public Date getNaissance() {
		return naissance;
	}

	/**
	 * @param naissance the naissance to set
	 */
	public Auteur setNaissance(Date naissance) {
		this.naissance = naissance;
		return this;
	}
}
