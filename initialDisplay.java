import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingConstants;


public class initialDisplay extends Display{

	
	Button b;
	
	Image bIcon; 
	Image bIconPressed;
	
	public initialDisplay(int x, int y, int w, int h, JFrame f, Program program) {
		super(x, y, w, h, f, program);
		// TODO Auto-generated constructor stub
	}

	@Override
	void init() {
		String[] t = {"Test", "jjjjjjjllllllllllllll"};
		b = new Button(new empty(hostProgram),t, 200, 200, 120, 90);
		
		try{
		bIcon = ImageIO.read(  
			this.getClass().getResource("/Images/Icon1.png")).getScaledInstance(120, 90, Image.SCALE_SMOOTH);  
	}
	catch(Exception e){}
		System.out.println(bIcon.hashCode());
		try{
			bIconPressed = ImageIO.read(  
				this.getClass().getResource("/Images/Icon1pressed.png")).getScaledInstance(120, 90, Image.SCALE_SMOOTH);  
		}
		catch(Exception e){}
		b.setBackground(hostFrame.getContentPane().getBackground());
		b.setBorder(null);
		b.setHoverBackgroundColor(hostFrame.getContentPane().getBackground());
		b.setPressedBackgroundColor(hostFrame.getContentPane().getBackground());
		b.setContentAreaFilled(false);
		b.setVerticalTextPosition(SwingConstants.CENTER);
		b.setHorizontalTextPosition(SwingConstants.CENTER);
		b.setIcon(new ImageIcon(bIcon));
		b.setPressedIcon(new ImageIcon(bIconPressed));
		add(b);
		
		repaint();
		
	}

	@Override
	protected void paintComponent(Graphics g) {
	
		
	}
	
	

}
