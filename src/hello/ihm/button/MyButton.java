/**
 * 
 */
package hello.ihm.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolTip;

/**
 * @author jean-
 *
 */
public class MyButton extends JButton implements ActionListener {
	private int width;
	private int height;
	
	public MyButton() {
		this.addActionListener(this);
	}
	
	public void setButtonCaption(String caption) {
		this.setText(caption);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		this.setText("Et voilà");
		this.setEnabled(false);
	}
}
