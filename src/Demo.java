import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Demo {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		AddSub t = new AddSub();

	}

}

class AddSub extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JTextField i, j;
	JButton b, b1;
	JLabel x;

	public AddSub() {

		i = new JTextField(15);
		j = new JTextField(15);
		b = new JButton("Add");
		b1 = new JButton("Sub");
		x = new JLabel("Result");
		add(i);
		add(j);
		add(b);
		add(b1);
		add(x);

		b.addActionListener(this);
		b1.addActionListener(this);

		setLayout(new FlowLayout());
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		int m = Integer.parseInt(i.getText());
		int n = Integer.parseInt(j.getText());
		int value = 0;

		if (e.getSource() == b)
			value = m + n;
		else
			value = m - n;

		x.setText(value + "");

	}

}
