/**
 * 
 */
package hello.utilisateurs;

import hello.livre.Livre;
import hello.utilisateurs.interfaces.EmprunteurInterface;
import hello.utilisateurs.interfaces.LoueurInterface;

/**
 * @author jean-
 *
 */
public class EmprunteurLoueur extends Utilisateur implements EmprunteurInterface, LoueurInterface {

	/* (non-Javadoc)
	 * @see hello.utilisateurs.interfaces.LoueurInterface#toEmprunteur()
	 */
	@Override
	public Utilisateur toEmprunteur() {
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
		return this;
	}

	/* (non-Javadoc)
	 * @see hello.utilisateurs.interfaces.LoueurInterface#addBook(hello.livre.Livre)
	 */
	@Override
	public Utilisateur addBook(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.utilisateurs.interfaces.LoueurInterface#loan(hello.livre.Livre)
	 */
	@Override
	public Utilisateur loan(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.utilisateurs.interfaces.LoueurInterface#calculeCotisation()
	 */
	@Override
	public Utilisateur calculeCotisation() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.utilisateurs.interfaces.EmprunteurInterface#facturation()
	 */
	@Override
	public Utilisateur facturation() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.utilisateurs.interfaces.EmprunteurInterface#createBookBorrowing(hello.utilisateurs.Loueur, hello.livre.Livre)
	 */
	@Override
	public Utilisateur createBookBorrowing(Loueur loueur, Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.utilisateurs.interfaces.EmprunteurInterface#returnBook(hello.utilisateurs.Loueur, hello.livre.Livre)
	 */
	@Override
	public Utilisateur returnBook(Loueur loueur, Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

}
