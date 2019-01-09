/**
 * 
 */
package hello.utilisateurs;

/**
 * @author jean-
 *
 */
abstract public class Utilisateur {
	protected String nom;
	protected String prenom;
	protected String numAdherent;
	
	public Utilisateur nom(String nom) {
		this.nom = nom;
		return this;
	}
	
	public String nom() {
		return this.nom;
	}
	
	public Utilisateur prenom(String prenom) {
		this.prenom = prenom;
		return this;
	}
	
	

	/**
	 * @param prenom the prenom to set
	 * @usage :
	 * 	Case 1 : Utilisateur user = new Utilisateur();
	 * user
	 * 	.nom("Test")
	 * 	.prenom("Re Test"); // It's ok
	 * Mais...
	 * 	user.setPrenom("Autre test")
	 * 		.nom("Test"); // Doesn't work
	 * Donc...
	 * 	user.setPrenom("Casper");
	 * 	user.nom("Le Fantôme"); // That's all folks
	 */

	public String prenom() {
		return this.prenom;
	}
	
	public Utilisateur numAdherent(String numAdherent) {
		this.numAdherent = numAdherent;
		return this;
	}
	
	public String numAdherent() {
		return this.numAdherent;
	}
	
	
}
