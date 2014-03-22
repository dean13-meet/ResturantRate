import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class Program {

	static JFrame initialF = new JFrame(); 
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	static double width = screenSize.getWidth();
	static double height = screenSize.getHeight();
	static final int DISPLAY_WIDTH = (int) (width/1.4); 
	static final int DISPLAY_HEIGHT = (int) (height/1.4); 
	static final int xOffSet = 10;
	static final int yOffSet = xOffSet;

	Program(){

		initialF.setSize(DISPLAY_WIDTH, DISPLAY_HEIGHT); 
		initialF.setLayout(null); 
		initialF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		initialF.setTitle("ResturantRate"); 
		initialF.getContentPane().setBackground(new Color(255,153,0));
		System.out.println(initialF.getContentPane().getBackground());
		Display initialD = createDisplay(xOffSet, yOffSet, DISPLAY_WIDTH - (2*xOffSet), 
				DISPLAY_HEIGHT - (2*yOffSet), initialF);

		
		initialF.add(initialD); 
		initialF.setVisible(true);
		initialF.setResizable(false);

	}
	public Display createDisplay(int x, int y, int w, int h, JFrame f) {

		return new initialDisplay(x, y, w, h, f, this);
	} 
}
