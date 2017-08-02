import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class New {

	public static void main(String[] args) {

		Radio obj = new Radio();

	}

}

class Radio extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField i;
	JButton b;
	JRadioButton r, r1;
	JCheckBox c, c1;
	JLabel x;

	public Radio() {

		i = new JTextField(15);
		r = new JRadioButton("Male");
		r1 = new JRadioButton("Female");
		c = new JCheckBox("Singer");
		c1 = new JCheckBox("Dancer");
		b = new JButton("OK");
		x = new JLabel("Greetings");

		ButtonGroup bg = new ButtonGroup();
		bg.add(r);
		bg.add(r1);

		add(i);
		add(r);
		add(r1);
		add(c);
		add(c1);
		add(b);
		add(x);

		c.addItemListener(l -> {
			System.out.println("Singing");
		});

		b.addActionListener(ae -> {

			String name = i.getText();
			if (r.isSelected()) {
				name = "Mr. " + name;
			} else {
				name = "Ms. " + name;
			}
			if (c.isSelected()) {
				name = name + " Singer";
			}
			if (c1.isSelected()) {
				name = name + " Dancer";
			}

			x.setText(name);
		});

		setLayout(new FlowLayout());
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
