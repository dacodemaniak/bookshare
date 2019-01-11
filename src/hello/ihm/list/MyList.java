/**
 * 
 */
package hello.ihm.list;

import javax.swing.JList;

import hello.livre.Auteur;

/**
 * @author jean-
 *
 */
public class MyList extends JList<String> {
	public MyList(String[] auteurs) {
		this.setListData(auteurs);
	}
}
