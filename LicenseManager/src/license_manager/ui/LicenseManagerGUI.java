package license_manager.ui;

import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Trying to create a GUI for the License Manager
 * 
 * @author Joel Reji
 * @author Allen Thomas
 *
 */
public class LicenseManagerGUI {

	/**
	 * Sets up the GUI and puts the necessary items in it
	 * 
	 * @return
	 */
	public static void main(String[] args) {

		String[] labels = { "First Name: ", "Last Name: ", "License Number: " };
		int numPairs = labels.length;

		JFrame frame = new JFrame("License Manager");

		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		for (int i = 0; i < numPairs; i++) {
			JLabel l = new JLabel(labels[i], JLabel.TRAILING);
			panel.add(l);
			JTextField textField = new JTextField(10);

			l.setLabelFor(textField);
			panel.add(textField);
		}

		JButton button = new JButton();
		button.setText("Check ID");

		panel.add(button);
		frame.add(panel);
		frame.setSize(700, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
