/**
 * 
 */
package hello.livre;

/**
 * @author jean-
 *
 */
public class Livre {
	private String titre;
	private String resume;
	private int nbPages;
	
	// Définition d'une constante de classe
	// Le mot clé final interdit la modification de la valeur
	private final int MINIMUM = 4;
	
	public Livre(String titre, String resume, int nbPages) {
		this.titre = titre;
		this.resume = resume;
		
		if (nbPages >= MINIMUM) {
			this.nbPages = nbPages;
		} else {
			this.nbPages = MINIMUM;
		}
	}
	
	public Livre() {
		// TODO Auto-generated constructor stub
	}


	
	public Livre resume(String resume) {
		this.resume = resume;
		return this;
	}
	
	public Livre nbPages(int nbPages) {
		if (nbPages >= MINIMUM) {
			this.nbPages = nbPages;
		} else {
			this.nbPages = MINIMUM;
		}
		
		return this;
		
	}

	public Livre titre(String titre) {
		this.titre = titre;
		return this;
	}
	
	public String titre() {
		return this.titre;
	}
	
	public String resume() {
		return this.resume;
	}
	
	public int nbPages() {
		return this.nbPages;
	}
}
