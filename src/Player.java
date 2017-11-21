import java.awt.Graphics;
import java.awt.TextField;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Player extends GameObject {
	int imgx;
	int imgy;
	int spaceValue;
	boolean inJail;
	public static BufferedImage image;
	String imageName;
	int muneez;
	int RollsLeftUntilOutOfJail;

	// JLabel label= new JLabel();
	Player(int x, int y, int width, int height, String imageName, int spaceValue, boolean inJail, int muneez, int rollsLeftUntilOutOfJail) {
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
		if (ObjectManager.players.get(0).spaceValue == ObjectManager.spaces.get(25).id) {
			ObjectManager.players.get(0).inJail = true;
			ObjectManager.players.get(0).spaceValue = ObjectManager.spaces.get(9).id;
			ObjectManager.players.get(0).RollsLeftUntilOutOfJail = 3;
			g.drawString("Well you were caught with a fidget spinner.", 1400 ,100);
			g.drawString("The only punishment for that is DEATH...", 1400 ,140);
			g.drawString("I mean...", 1400 ,180);
			g.drawString("3 days jail time...", 1400 ,220);
		}
		if (ObjectManager.dice.get(0).value == ObjectManager.dice.get(1).value) {
			ObjectManager.players.get(0).inJail = false;
		}
		if (ObjectManager.players.get(0).inJail == true) {
			ObjectManager.players.get(0).spaceValue = ObjectManager.spaces.get(9).id;
		}

		if (ObjectManager.players.get(0).RollsLeftUntilOutOfJail > 0) {
			ObjectManager.players.get(0).RollsLeftUntilOutOfJail -= 1;
		} else if (ObjectManager.players.get(0).RollsLeftUntilOutOfJail == 0) {
			ObjectManager.players.get(0).inJail = false;
		}
		if (ObjectManager.players.get(0).spaceValue == ObjectManager.spaces.get(6).id
				|| ObjectManager.players.get(0).spaceValue == ObjectManager.spaces.get(11).id
				|| ObjectManager.players.get(0).spaceValue == ObjectManager.spaces.get(19).id
				|| ObjectManager.players.get(0).spaceValue == ObjectManager.spaces.get(27).id) {
			int chance = new Random().nextInt(150);
			if (chance == 0||chance == 1||chance == 2||chance == 3||chance == 4||chance == 5||chance == 6||chance == 7||chance == 8||chance == 9) {
				g.drawString("You bought a lottery ticket for 5 Dollars.", 1400 ,100);
				g.drawString("However, you lost...", 1400 ,140);
				ObjectManager.players.get(0).muneez-=5;
			}
			else if (chance == 10) {
				g.drawString("You bought a lottery ticket for 5 Dollars.", 1400 ,100);
				g.drawString("AND YOU WON 10,000 DOLLARS!!!", 1400 ,140);
				g.drawString("Minus the 5 Dollars you spent...", 1400 ,180);
				ObjectManager.players.get(0).muneez+=9995;
			}
			else if (chance == 2) {

			}
			else if (chance == 3) {

			}
			else if (chance == 4) {

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
		ObjectManager.players.get(0).x = ObjectManager.spaces.get(ObjectManager.players.get(0).spaceValue).x + 5;
		// System.out.println(ObjectManager.spaces.get(ObjectManager.players.get(0).spaceValue).x+5);
		ObjectManager.players.get(0).y = ObjectManager.spaces.get(ObjectManager.players.get(0).spaceValue).y + 5;
		// System.out.println(ObjectManager.spaces.get(ObjectManager.players.get(0).spaceValue).y+5);
		System.out.println("Space Value: " + ObjectManager.players.get(0).spaceValue);
		try {
			this.image = ImageIO.read(this.getClass().getResourceAsStream(imageName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (image != null) {
			g.drawImage(image, x, y, null);
			System.out.println("In jail: " + ObjectManager.players.get(0).inJail);
			System.out.println("Space p1 is on: " + ObjectManager.players.get(0).spaceValue);
			System.out.println("Turns til out of Jail: " + ObjectManager.players.get(0).RollsLeftUntilOutOfJail);
			System.out.println("Muneez: "+muneez);
			System.out.println();
		}
		// if(label!=null) {

		// }
	}
}
