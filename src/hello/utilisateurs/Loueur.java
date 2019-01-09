/**
 * 
 */
package hello.utilisateurs;

import hello.livre.Livre;
/**
 * @author jean-
 *
 */
import hello.utilisateurs.interfaces.LoueurInterface;

public class Loueur extends Utilisateur implements LoueurInterface {

	@Override
	public Utilisateur addBook(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur loan(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur calculeCotisation() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.utilisateurs.interfaces.LoueurInterface#toEmprunteur()
	 */
	@Override
	public Utilisateur toEmprunteur() {
		// TODO Auto-generated method stub
		return new Emprunteur()
				.nom(nom)
				.prenom(prenom)
				.numAdherent(numAdherent);
	}

	/* (non-Javadoc)
	 * @see hello.utilisateurs.interfaces.LoueurInterface#toEmprunteurLoueur()
	 */
	@Override
	public Utilisateur toEmprunteurLoueur() {
		// TODO Auto-generated method stub
		return new EmprunteurLoueur()
				.nom(nom)
				.prenom(prenom)
				.numAdherent(numAdherent);
	}
	
	

}
