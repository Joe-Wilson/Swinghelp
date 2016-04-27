package lib;

import javax.swing.JFrame;

public class Window extends JFrame {
	public IORead reader = new IORead();

	public Window(int width, int height) {
		this.setSize(width, height);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		this.addMouseListener(reader);
		this.addMouseMotionListener(reader);
		this.addMouseWheelListener(reader);
		this.addKeyListener(reader);
	}
}
