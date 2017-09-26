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
	Logo l=new Logo(380,380,250,250);
	ObjectManager o;
	
	
	public MemeGamePanel() {
		o = new ObjectManager();
		
		try {
			memenopolyImg = ImageIO.read(this.getClass().getResourceAsStream("L0g0.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
			l.draw(g);
			o.draw(g);
		}

}
