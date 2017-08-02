import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DemoinLambda {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		Test t = new Test();

	}

}

class Test extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField i, j;
	JButton b, b1;
	JLabel x;

	public Test() {

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

		b.addActionListener(ae -> {

			int a = Integer.parseInt(i.getText());
			int b = Integer.parseInt(j.getText());
			int c = a + b;
			x.setText(c + "");

		});

		b1.addActionListener(ae -> {

			int a = Integer.parseInt(i.getText());
			int b = Integer.parseInt(j.getText());
			int d = a - b;
			x.setText(d + "");

		});

		setLayout(new FlowLayout());
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
