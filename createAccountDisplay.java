import java.awt.Graphics;

import javax.swing.JFrame;


public class createAccountDisplay extends Display {

	public createAccountDisplay(int x, int y, int w, int h, JFrame f,
			Program program) {
		super(x, y, w, h, f, program);
		// TODO Auto-generated constructor stub
	}

	@Override
	void init() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void paintComponent(Graphics g) {
		g.fillRect(10, 10, 100, 100);

	}

}
