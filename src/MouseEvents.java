import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MouseEvents {

	public static void main(String[] args) {

		A obj = new A();

	}

}

class A extends JFrame {

	private static final long serialVersionUID = 1L;

	public A() {

		addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				System.out.println(x + " , " + y);
			}
		});

		setLayout(new FlowLayout());
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}