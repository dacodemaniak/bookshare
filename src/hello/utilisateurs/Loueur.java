/**
 * 
 */
package hello.utilisateurs;

import java.util.ArrayList;
import java.util.Arrays;

import hello.livre.Livre;
/**
 * @author jean-
 *
 */
import hello.utilisateurs.interfaces.LoueurInterface;

public class Loueur extends Utilisateur implements LoueurInterface {
	private ArrayList<Livre> books;
	
	public Loueur() {
		this.books = new ArrayList<Livre>();
	}
	
	public String booksNumber() {
		String message = "Nombre de livres : ";
		message += this.books.size();
		
		return message;
	}
	
	
	@Override
	public Utilisateur addBook(Livre livre) {
		// TODO Auto-generated method stub
		if (!this.books.contains(livre)) {
			this.books.add(livre);
		}
		
		return this;
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
