/**
 * 
 */
package hello.utilisateurs;

import hello.livre.Livre;
import hello.utilisateurs.interfaces.EmprunteurInterface;

/**
 * @author jean-
 *
 */
public class Emprunteur extends Utilisateur implements EmprunteurInterface {

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
