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
	static int turn = 1;
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
		// TODO Auto-generated method stub'

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_Y) {
			System.out.println("Player Input: Yes");
			System.out.println("Turn: " + turn);
			System.out.println(
					"Player Owner: " + ObjectManager.spaces.get(ObjectManager.player1.spaceValue).owner);
			if (turn == 0) {
				if (ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id == 1
						|| ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id == 2
						|| ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id == 5
						|| ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id == 7
						|| ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id == 8
						|| ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id == 10
						|| ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id == 12
						|| ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id == 14
						|| ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id == 15
						|| ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id == 17
						|| ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id == 18
						|| ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id == 20
						|| ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id == 21
						|| ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id == 23
						|| ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id == 24
						|| ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id == 26
						|| ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id == 28
						|| ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id == 30
						|| ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id == 31) {
					if (ObjectManager.spaces.get(ObjectManager.player1.spaceValue).owner == 0) {
						ObjectManager.player1.muneez -= (60
								+ (ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id * 20));
						ObjectManager.spaces.get(ObjectManager.player1.spaceValue).owner = 1;
					}
					else if (ObjectManager.spaces.get(ObjectManager.player1.spaceValue).owner == 1) {
						ObjectManager.player1.muneez -= ((ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id * 20/2));
						ObjectManager.spaces.get(ObjectManager.player1.spaceValue).upgrade+= 1;
					}
					
				}
			}
			if (turn == 1) {
				if (ObjectManager.spaces.get(ObjectManager.player2.spaceValue).id == 1
						|| ObjectManager.spaces.get(ObjectManager.player2.spaceValue).id == 2
						|| ObjectManager.spaces.get(ObjectManager.player2.spaceValue).id == 5
						|| ObjectManager.spaces.get(ObjectManager.player2.spaceValue).id == 7
						|| ObjectManager.spaces.get(ObjectManager.player2.spaceValue).id == 8
						|| ObjectManager.spaces.get(ObjectManager.player2.spaceValue).id == 10
						|| ObjectManager.spaces.get(ObjectManager.player2.spaceValue).id == 12
						|| ObjectManager.spaces.get(ObjectManager.player2.spaceValue).id == 14
						|| ObjectManager.spaces.get(ObjectManager.player2.spaceValue).id == 15
						|| ObjectManager.spaces.get(ObjectManager.player2.spaceValue).id == 17
						|| ObjectManager.spaces.get(ObjectManager.player2.spaceValue).id == 18
						|| ObjectManager.spaces.get(ObjectManager.player2.spaceValue).id == 20
						|| ObjectManager.spaces.get(ObjectManager.player2.spaceValue).id == 21
						|| ObjectManager.spaces.get(ObjectManager.player2.spaceValue).id == 23
						|| ObjectManager.spaces.get(ObjectManager.player2.spaceValue).id == 24
						|| ObjectManager.spaces.get(ObjectManager.player2.spaceValue).id == 26
						|| ObjectManager.spaces.get(ObjectManager.player2.spaceValue).id == 28
						|| ObjectManager.spaces.get(ObjectManager.player2.spaceValue).id == 30
						|| ObjectManager.spaces.get(ObjectManager.player2.spaceValue).id == 31) {

					if (ObjectManager.spaces.get(ObjectManager.player2.spaceValue).owner == 0) {
						ObjectManager.player2.muneez -= (60
								+ (ObjectManager.spaces.get(ObjectManager.player2.spaceValue).id * 20));
						ObjectManager.spaces.get(ObjectManager.player2.spaceValue).owner = 2;
					}
					else if (ObjectManager.spaces.get(ObjectManager.player2.spaceValue).owner == 2) {
						ObjectManager.player2.muneez -= ((ObjectManager.spaces.get(ObjectManager.player2.spaceValue).id * 20/2));
						ObjectManager.spaces.get(ObjectManager.player2.spaceValue).upgrade+= 1;
					}
				}
			}
			
		}
		if (e.getKeyCode() == KeyEvent.VK_N) {
			System.out.println("Player Input: No");
		}
		if (e.getKeyCode() == KeyEvent.VK_R) {
			System.out.println("Player Input: Restarting");
			o=new ObjectManager();
			ObjectManager.player1 =new Player1(100, 560, 150, 100, "troll.png", 0, false, 2000, 0);
			ObjectManager.player2 =new Player2(100, 560, 150, 100, "derp.png", 0, false, 2000, 0);
			ObjectManager.dice.get(0).value=0;
		}
		repaint();
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
			//if (ObjectManager.dice.value != ObjectManager.dice.get(1).value) {
				turn +=1;
			//}
			if (turn >= 2) {
							turn = 0;
						}
			if (turn == 0) {
				ObjectManager.player1.spaceValue = ObjectManager.player1.spaceValue
						+ ObjectManager.dice.get(0).value + ObjectManager.dice.get(1).value + 2;
				System.out.println("Total: " + (ObjectManager.dice.get(0).value + ObjectManager.dice.get(1).value + 2));
				if (ObjectManager.player1.spaceValue > 31) {
					ObjectManager.player1.spaceValue = ObjectManager.player1.spaceValue - 32;
					ObjectManager.player1.muneez += 200;
				}
				System.out.println(turn);
			} else if (turn == 1) {
				ObjectManager.player2.spaceValue = ObjectManager.player2.spaceValue
						+ ObjectManager.dice.get(0).value + ObjectManager.dice.get(1).value + 2;
				System.out.println("Total: " + (ObjectManager.dice.get(0).value + ObjectManager.dice.get(1).value + 2));
				if (ObjectManager.player2.spaceValue > 31) {
					ObjectManager.player2.spaceValue = ObjectManager.player2.spaceValue - 32;
					ObjectManager.player2.muneez += 200;
				}

				
				
			}
			
		}
		repaint();
		System.out.println("turn "+turn);
		
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
