/**
 * 
 */
package hello.livre;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import hello.livre.exceptions.BirthdateException;

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
	
	public static Auteur getAuteur(String nom, String prenom, Date naissance) throws BirthdateException {
		Date today = new Date();
		if (naissance.after(today)) {
			throw new BirthdateException();
		}
		
		Auteur auteur = new Auteur(nom, prenom, naissance);
		return auteur;
	}
	
	public static Auteur getAuteur() throws ParseException, BirthdateException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nom de l'auteur : ");
		String nom = scanner.nextLine();
		scanner.nextLine();
		
		System.out.println("Prénom de l'auteur : ");
		String prenom = scanner.nextLine();
		scanner.nextLine();
		
		System.out.println("Date de naissance : ");
		String naissance = scanner.nextLine();
		
		// Convertir la chaîne en date
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(naissance);
		
		System.out.print(" Test numérique ");
		int age = scanner.nextInt();
		
		//scanner.nextLine();
		scanner.close();
		
		// On peut instancier un nouvel Auteur à partir des informations
		return getAuteur(nom, prenom, date);
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
	
	public void insert() {
		
		try {
			String sql = "INSERT INTO auteurs (";
			sql += this.getAttributes();
			sql += ") VALUES (";
			sql += this.getAttributesVal();
			sql += ");";
			
			System.out.println("requête d'insertion : " + sql);
			
		} catch (Exception e) {
			
		}
	}
	
	private String getAttributes() throws IllegalArgumentException, IllegalAccessException {
		String fieldList = "";
		for (Field field : this.getClass().getDeclaredFields()) {
			fieldList += field.getName() + ",";
		}
		return fieldList.substring(-1);
	}
	
	private String getAttributesVal() throws IllegalArgumentException, IllegalAccessException {
		String fieldList = "";
		for (Field field : this.getClass().getDeclaredFields()) {
			String value = "'" + field.get(this) + "'";
			
			fieldList +=  value + ",";
		}
		return fieldList.substring(-1);
	}
}
