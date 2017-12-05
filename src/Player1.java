import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Player1 extends GameObject {
	int imgx;
	int imgy;
	int spaceValue;
	boolean inJail;
	public static BufferedImage image;
	String imageName;
	int muneez;
	int RollsLeftUntilOutOfJail;

	// JLabel label= new JLabel();
	Player1(int x, int y, int width, int height, String imageName, int spaceValue, boolean inJail, int muneez, int rollsLeftUntilOutOfJail) {
		super(x, y, width, height);
		this.RollsLeftUntilOutOfJail = RollsLeftUntilOutOfJail;
		this.spaceValue = spaceValue;
		this.imageName = imageName;
		this.inJail = inJail;
		this.muneez = muneez;
		if (imageName != null) {
			try {
				this.image = ImageIO.read(this.getClass().getResourceAsStream(imageName));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// if(label!=null) {
		// Font font = new Font("Impact", Font.BOLD, 15);
		// this.label.setText(label);
		// this.label.setFont(font);
		// }
	}

	void draw(Graphics g) {
		if (ObjectManager.player1.get(0).spaceValue == ObjectManager.spaces.get(25).id) {
			ObjectManager.player1.get(0).inJail = true;
			ObjectManager.player1.get(0).spaceValue = ObjectManager.spaces.get(9).id;
			ObjectManager.player1.get(0).RollsLeftUntilOutOfJail = 3;
			g.drawString("Well you were caught with a fidget spinner.", 1400 ,100);
			g.drawString("The only punishment for that is DEATH...", 1400 ,140);
			g.drawString("I mean...", 1400 ,180);
			g.drawString("3 days jail time...", 1400 ,220);
		}
		if (ObjectManager.dice.get(0).value == ObjectManager.dice.get(1).value) {
			if(MemeGamePanel.turn==0) {
			ObjectManager.player1.get(0).inJail = false;
			}
		}
		if (ObjectManager.player1.get(0).inJail) {
			ObjectManager.player1.get(0).spaceValue = ObjectManager.spaces.get(9).id;
			ObjectManager.player1.get(0).x = ObjectManager.spaces.get(9).x+30;
		}

		if (ObjectManager.player1.get(0).RollsLeftUntilOutOfJail > 0) {
			if(MemeGamePanel.turn==1) {
				ObjectManager.player1.get(0).RollsLeftUntilOutOfJail-=1;
			}
		} else if (ObjectManager.player1.get(0).RollsLeftUntilOutOfJail == 0) {
			ObjectManager.player1.get(0).inJail = false;
		}
		if (ObjectManager.player1.get(0).spaceValue == ObjectManager.spaces.get(6).id
				|| ObjectManager.player1.get(0).spaceValue == ObjectManager.spaces.get(11).id
				|| ObjectManager.player1.get(0).spaceValue == ObjectManager.spaces.get(19).id
				|| ObjectManager.player1.get(0).spaceValue == ObjectManager.spaces.get(27).id) {
			int chance = new Random().nextInt(25);
			if (chance == 0||chance == 1||chance == 2||chance == 3||chance == 4||chance == 5||chance == 6||chance == 7||chance == 8||chance == 9) {
				g.drawString("You bought a lottery ticket for 5 Dollars.", 1400 ,100);
				g.drawString("However, you lost...", 1400 ,140);
				ObjectManager.player1.get(0).muneez-=5;
			}
			else if (chance == 10) {
				g.drawString("You bought a lottery ticket for 5 Dollars.", 1400 ,100);
				g.drawString("AND YOU WON 10,000 DOLLARS!!!", 1400 ,140);
				g.drawString("Minus the 5 Dollars you spent...", 1400 ,180);
				ObjectManager.player1.get(0).muneez+=9995;
			}
			else if (chance == 11||chance == 12||chance == 13||chance == 14||chance == 15||chance == 16) {
				g.drawString("You have been sent to jail.", 1400 ,100);
				g.drawString("Not enough memes...", 1400 ,140);
				ObjectManager.player1.get(0).inJail = true;
				ObjectManager.player1.get(0).spaceValue = ObjectManager.spaces.get(9).id;
				ObjectManager.player1.get(0).RollsLeftUntilOutOfJail = 3;
				ObjectManager.player1.get(0).x = ObjectManager.spaces.get(9).x+30;
			}
			else if (chance == 17||chance == 18||chance == 19||chance == 20) {
				g.drawString("Grumpy Cat summons you.", 1400 ,100);
				g.drawString("Advance to "+"''Grumpy Cat''", 1400 ,140);
				g.drawString("If unowned, you may buy the space Grumpy Cat resides on.", 1400 ,180);
				ObjectManager.player1.get(0).spaceValue = ObjectManager.spaces.get(31).id;
			}
			else if (chance >= 20&&chance<=25) {
				g.drawString("Advance to Go and collect $200", 1400 ,140);
				ObjectManager.player1.get(0).spaceValue = ObjectManager.spaces.get(0).id;
				ObjectManager.player1.get(0).muneez+=200;
			}
			else if (chance == 5) {

			}
			else if (chance == 6) {

			}
			else if (chance == 7) {

			}
			else if (chance == 8) {

			}
			else if (chance == 9) {

			}
			else if (chance == 10) {

			}
			else if (chance == 11) {

			}
			else if (chance == 12) {

			}
			else if (chance == 13) {

			}
			else if (chance == 14) {

			}
			else if (chance == 15) {

			}
		}
		if (ObjectManager.player1.get(0).spaceValue == ObjectManager.spaces.get(1).id) {
			if (ObjectManager.spaces.get(1).owner == 0) {
				g.drawString("This property is unowned", 1400 ,140);
				g.drawString("It costs 80 Dollars, and pays 40 when landed on.", 1400 ,180);
				g.drawString("Will you buy this property?", 1400 ,220);
				g.drawString("Type ''Y'' if yes, type ''N'' if no(ends turn).", 1400 ,260);
				g.drawString("Caps doesn't matter", 1400 ,300);
				
			}
		}
		if (ObjectManager.player1.get(0).spaceValue == ObjectManager.spaces.get(3).id) {
			g.drawString("You have landed on ''Taxes''", 1400 ,100);
			int taxChance = new Random().nextInt(25);
			if(taxChance==1) {
				g.drawString("You must pay $200 to our glorious president Trump", 1400 ,140);
				g.drawString("for a great wall.", 1400 ,180);
			}
			else {
				g.drawString("You must pay $200 to the government", 1400 ,140);
			}
			ObjectManager.player1.get(0).muneez-=200;
		}
		ObjectManager.player1.get(0).x = ObjectManager.spaces.get(ObjectManager.player1.get(0).spaceValue).x + 5;
		// System.out.println(ObjectManager.spaces.get(ObjectManager.players.get(0).spaceValue).x+5);
		if (ObjectManager.player1.get(0).inJail == true) {
			ObjectManager.player1.get(0).x = ObjectManager.spaces.get(9).x+45;
		}
		ObjectManager.player1.get(0).y = ObjectManager.spaces.get(ObjectManager.player1.get(0).spaceValue).y + 5;
		// System.out.println(ObjectManager.spaces.get(ObjectManager.players.get(0).spaceValue).y+5);
		System.out.println("Space Value: " + ObjectManager.player1.get(0).spaceValue);
		g.drawString("P.1 Money: "+ObjectManager.player1.get(0).muneez, 1200 ,800);
		try {
			this.image = ImageIO.read(this.getClass().getResourceAsStream(imageName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (image != null) {
			g.drawImage(image, x, y, null);
			System.out.println("In jail(p1): " + ObjectManager.player1.get(0).inJail);
			System.out.println("Space is on(p1): " + ObjectManager.player1.get(0).spaceValue);
			System.out.println("Turns til out of Jail(p1): " + ObjectManager.player1.get(0).RollsLeftUntilOutOfJail);
			System.out.println("Muneez(p1): "+muneez);
			System.out.println();
		}
		// if(label!=null) {

		// }
	}
}
