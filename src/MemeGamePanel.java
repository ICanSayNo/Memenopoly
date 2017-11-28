import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MemeGamePanel extends JPanel implements ActionListener, KeyListener, MouseListener {
	public static BufferedImage memenopolyImg;
	public static BufferedImage memenopolyImg_Go;
	int turn=0;
	Image a = new Image(0, 0, 250, 250);

	ObjectManager o;

	public MemeGamePanel() {
		o = new ObjectManager();

		try {
			memenopolyImg = ImageIO.read(this.getClass().getResourceAsStream("L0g0.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			memenopolyImg_Go = ImageIO.read(this.getClass().getResourceAsStream("cerealGuy.png"));
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

	public void startGame() {

	}

	public void paintComponent(Graphics g) {
		setBackground(new Color(203, 233, 228));
		a.draw(g);
		o.draw(g);
		// System.out.println("test paint");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getX() > 1480 && e.getY() > 760) {
			Dice.roll();
			if (ObjectManager.dice.get(1).value == 0) {
				ObjectManager.dice.get(1).imageName = "diec-1.gif";
			}
			if (ObjectManager.dice.get(1).value == 1) {
				ObjectManager.dice.get(1).imageName = "diec-2.gif";
			}
			if (ObjectManager.dice.get(1).value == 2) {
				ObjectManager.dice.get(1).imageName = "diec-3.gif";
			}
			if (ObjectManager.dice.get(1).value == 3) {
				ObjectManager.dice.get(1).imageName = "diec-4.gif";
			}
			if (ObjectManager.dice.get(1).value == 4) {
				ObjectManager.dice.get(1).imageName = "diec-5.gif";
			}
			if (ObjectManager.dice.get(1).value == 5) {
				ObjectManager.dice.get(1).imageName = "diec-6.gif";
			}
			if (ObjectManager.dice.get(0).value == 0) {
				ObjectManager.dice.get(0).imageName = "diec-1.gif";
			}
			if (ObjectManager.dice.get(0).value == 1) {
				ObjectManager.dice.get(0).imageName = "diec-2.gif";
			}
			if (ObjectManager.dice.get(0).value == 2) {
				ObjectManager.dice.get(0).imageName = "diec-3.gif";
			}
			if (ObjectManager.dice.get(0).value == 3) {
				ObjectManager.dice.get(0).imageName = "diec-4.gif";
			}
			if (ObjectManager.dice.get(0).value == 4) {
				ObjectManager.dice.get(0).imageName = "diec-5.gif";
			}
			if (ObjectManager.dice.get(0).value == 5) {
				ObjectManager.dice.get(0).imageName = "diec-6.gif";
			}
			if(turn>=2) {
				turn=0;
			}
			if(turn==0) {
			ObjectManager.player1.get(0).spaceValue = ObjectManager.player1.get(0).spaceValue
					+ ObjectManager.dice.get(0).value + ObjectManager.dice.get(1).value + 2;
			System.out.println("Total: " + (ObjectManager.dice.get(0).value + ObjectManager.dice.get(1).value + 2));
			if (ObjectManager.player1.get(0).spaceValue > 31) {
				ObjectManager.player1.get(0).spaceValue = ObjectManager.player1.get(0).spaceValue - 32;
				ObjectManager.player1.get(0).muneez+=200;	
			}
			if(ObjectManager.dice.get(0).value!=ObjectManager.dice.get(1).value) {
				turn+=1;
		}
				System.out.println(turn);
			}
			else if(turn==1) {
				ObjectManager.player2.get(0).spaceValue = ObjectManager.player2.get(0).spaceValue
						+ ObjectManager.dice.get(0).value + ObjectManager.dice.get(1).value + 2;
				System.out.println("Total: " + (ObjectManager.dice.get(0).value + ObjectManager.dice.get(1).value + 2));
				if (ObjectManager.player2.get(0).spaceValue > 31) {
					ObjectManager.player2.get(0).spaceValue = ObjectManager.player2.get(0).spaceValue - 32;
					ObjectManager.player2.get(0).muneez+=200;	
				}
				if(ObjectManager.dice.get(0).value!=ObjectManager.dice.get(1).value) {
						turn+=1;
				}
				
					System.out.println(turn);
				}
			}
		repaint();

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
