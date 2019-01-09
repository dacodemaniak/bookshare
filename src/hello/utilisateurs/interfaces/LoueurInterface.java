/**
 * 
 */
package hello.utilisateurs.interfaces;

import hello.livre.Livre;
import hello.utilisateurs.Utilisateur;

/**
 * @author jean-
 *
 */
public interface LoueurInterface {
	public Utilisateur addBook(Livre livre);
	public Utilisateur loan(Livre livre);
	public Utilisateur calculeCotisation();
	
	public Utilisateur toEmprunteur();
	public Utilisateur toEmprunteurLoueur();
}
