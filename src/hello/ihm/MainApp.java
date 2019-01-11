/**
 * 
 */
package hello.ihm;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

import hello.livre.Auteur;

/**
 * @author jean-
 *
 */
public class MainApp extends JFrame {
	public MainApp() {
		this.setTitle("Mon application");
		this.setSize(800, 600);
		this.getContentPane().setLayout(new FlowLayout());
	}
	
	public void changeBackgroundColor(Color bgColor) {
		this.getContentPane().setBackground(bgColor);
	}
	
	public void addButton(JButton button) {
		this.getContentPane().add(button);
	}
	
	public void addListe(JList<String> list) {
		this.getContentPane().add(list);
	}
}
