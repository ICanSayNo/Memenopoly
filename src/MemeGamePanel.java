import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MemeGamePanel extends JPanel implements ActionListener, KeyListener {
	public static BufferedImage memenopolyImg;
	Logo l=new Logo(250,250,250,250);
	
	public MemeGamePanel() {
		
		try {
			memenopolyImg = ImageIO.read(this.getClass().getResourceAsStream("Memenopoly_38b659_1764926.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		l.draw(getGraphics());
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

		public void startGame(){
			
	}
		public void paintComponent(Graphics g){
			Spaces s0 = new Spaces(1150,800,120,90);
			s0.draw(g);
			Spaces s1 = new Spaces(1010,800,120,90);
			s1.draw(g);
			Spaces s2 = new Spaces(870,800,120,90);
			s2.draw(g);
			Spaces s3 = new Spaces(730,800,120,90);
			s3.draw(g);
			Spaces s4 = new Spaces(590,800,120,90);
			s4.draw(g);
			Spaces s5 = new Spaces(450,800,120,90);
			s5.draw(g);
			Spaces s6 = new Spaces(310,800,120,90);
			s6.draw(g);
			Spaces s7 = new Spaces(170,800,120,90);
			s7.draw(g);
			Spaces s8 = new Spaces(20,800,120,90);
			s8.draw(g);
		}

}
