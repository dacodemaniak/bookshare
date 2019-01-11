/**
 * 
 */
package hello.utilisateurs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import hello.livre.Livre;

/**
 * @author jean-
 *
 */
import hello.utilisateurs.interfaces.LoueurInterface;

// Interface fonctionnelle
@FunctionalInterface
interface GetSize { 
	public double getSize(HashMap<Livre, Integer> livres);
}

public class Loueur extends Utilisateur implements LoueurInterface {
	private HashMap<Livre, Integer> books;
	
	private GetSize stock = (collection) -> {
		double stock = 0;
		for (Livre livre : collection.keySet()) {
			stock += collection.get(livre);
		}
		return stock;
	};
	
	private GetSize size = (collection) -> {
		return collection.size();
	};
	
	private GetSize average = (collection) -> {
		int stock = 0;
		for(Livre livre : collection.keySet()) {
			stock += collection.get(livre);
		}
		return stock / collection.size();
	};
	
	public Loueur() {
		// Instancie l'objet HashMap proprement dit
		this.books = new HashMap<Livre, Integer>();
	}
	
	public String booksNumber() {
		String message = "Nombre de livres : ";
		message += this.stock.getSize(this.books);
		
		return message;
	}
	
	public int getCollectionSize() {
	
		
		return (int) this.size.getSize(this.books);
	}
	
	public int getStockSize() {
		return (int) this.stock.getSize(this.books);
	}
	
	public String listBooks() {
		String message = "Livres de la collection de " + this.nom + "\n";
		
		Set <Entry<Livre, Integer>> entries = this.books.entrySet();
		Iterator <Entry<Livre, Integer>> iterator = entries.iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<Livre, Integer> entry = iterator.next();
			Livre livre = entry.getKey();
			Integer occurrences = entry.getValue();
			message += livre.titre() + " (" + occurrences + ")\n";
		}
		return message;
	}
	@Override
	public Utilisateur addBook(Livre livre) {
		// TODO Auto-generated method stub
		if (this.books.containsKey(livre)) {
			Integer oldValue = this.books.get(livre);
			oldValue = oldValue + 1;
			this.books.replace(livre, oldValue);
		} else {
			this.books.put(livre, 1);
		}
		
		return this;
	}

	@Override
	public Utilisateur loan(Livre livre) {
		// TODO Auto-generated method stub
		if (this.books.containsKey(livre)) {
			Integer inStock = this.books.get(livre);
			if ( inStock > 0) {
				this.books.replace(livre, --inStock);
			}
		}
		return this;
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
