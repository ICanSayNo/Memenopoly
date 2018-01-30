import java.awt.Color;
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
			
		g.setColor(Color.BLUE);
		g.drawString("Player 1 Feed:", 1400 ,120);
		if (ObjectManager.player1.spaceValue == ObjectManager.spaces.get(25).id) {
			ObjectManager.player1.inJail = true;
			ObjectManager.player1.spaceValue = ObjectManager.spaces.get(9).id;
			ObjectManager.player1.RollsLeftUntilOutOfJail = 3;
			g.drawString("Well you were caught with a fidget spinner.", 1400 ,140);
			g.drawString("The only punishment for that is DEATH...", 1400 ,160);
			g.drawString("I mean...", 1400 ,180);
			g.drawString("3 days jail time...", 1400 ,220);
		}
		if (ObjectManager.dice.get(0).value == ObjectManager.dice.get(1).value) {
			if(MemeGamePanel.turn==0) {
			ObjectManager.player1.inJail = false;
			}
		}
		if (ObjectManager.player1.inJail) {
			ObjectManager.player1.spaceValue = ObjectManager.spaces.get(9).id;
			ObjectManager.player1.x = ObjectManager.spaces.get(9).x+30;
		}

		if (ObjectManager.player1.RollsLeftUntilOutOfJail > 0) {
			if(MemeGamePanel.turn==0) {
				ObjectManager.player1.RollsLeftUntilOutOfJail-=1;
			}
		} else if (ObjectManager.player1.RollsLeftUntilOutOfJail == 0) {
			ObjectManager.player1.inJail = false;
		}
		if (MemeGamePanel.turn == 0) {
		if (ObjectManager.player1.spaceValue == ObjectManager.spaces.get(6).id
				|| ObjectManager.player1.spaceValue == ObjectManager.spaces.get(11).id
				|| ObjectManager.player1.spaceValue == ObjectManager.spaces.get(19).id
				|| ObjectManager.player1.spaceValue == ObjectManager.spaces.get(27).id) {
			int chance = new Random().nextInt(55);
			g.setColor(Color.GREEN.darker());
			g.fillRect(1200, 400, 350, 150);
			g.setColor(Color.BLACK);
			g.drawString( "CHANCE:", 1210, 420);
			if (chance == 0||chance == 1||chance == 2||chance == 3||chance == 4||chance == 5||chance == 6||chance == 7||chance == 8||chance == 9) {
				g.drawString("You bought a lottery ticket for 5 Dollars.", 1210 ,440);
				g.drawString("However, you lost...", 1210 ,460);
				ObjectManager.player1.muneez-=5;
			}
			else if (chance == 10) {
				g.drawString("You bought a lottery ticket for 5 Dollars.", 1210 ,440);
				g.drawString("AND YOU WON 10,000 DOLLARS!!!", 1210 ,460);
				g.drawString("Minus the 5 Dollars you spent...", 1210 ,480);
				ObjectManager.player1.muneez+=9995;
			}
			else if (chance == 11||chance == 12||chance == 13||chance == 14||chance == 15||chance == 16) {
				g.drawString("You have been sent to jail.", 1210 ,440);
				g.drawString("Not enough memes...", 1210 ,460);
				ObjectManager.player1.inJail = true;
				ObjectManager.player1.spaceValue = ObjectManager.spaces.get(9).id;
				ObjectManager.player1.RollsLeftUntilOutOfJail = 3;
				ObjectManager.player1.x = ObjectManager.spaces.get(9).x+30;
			}
			else if (chance == 17||chance == 18||chance == 19||chance == 20) {
				g.drawString("Grumpy Cat summons you.", 1210 ,440);
				g.drawString("Advance to "+"''Grumpy Cat''", 1210 ,460);
				g.drawString("If unowned, you may buy the space", 1210 ,480);
				g.drawString("Grumpy Cat resides on.", 1210 ,500);
				ObjectManager.player1.spaceValue = ObjectManager.spaces.get(31).id;
			}
			else if (chance >= 21&&chance<=25) {
				g.drawString("Advance to Go and collect $200", 1210 ,440);
				ObjectManager.player1.spaceValue = ObjectManager.spaces.get(0).id;
				ObjectManager.player1.muneez+=200;
			}
			else if (chance >= 26&&chance<=30) {
				g.drawString("Aw You got a dislike. Lose $50", 1210 ,440);
				ObjectManager.player1.muneez-=50;
			}
			else if (chance >= 31&&chance<=35) {
				g.drawString("Do u kno da wae? No u dont.", 1210 ,440);
				g.drawString( "Onleh me and my bruddas kno da wae",1210 ,460);
				g.drawString( "Lose $100 u not kno da wae, go to sanic.",1210 ,480);
				ObjectManager.player1.muneez-=100;
				ObjectManager.player1.spaceValue = ObjectManager.spaces.get(12).id;
			}
			else if (chance >= 36&&chance<=40) {
				g.drawString("You rekt Som Roblux Noobs. GG", 1210 ,440);
				g.drawString("You got 100 Robux, I mean $100.", 1210 ,460);
				ObjectManager.player1.muneez+=100;
			}
			else if (chance >= 41&&chance<=45) {
				g.drawString("You protested some stuff and you won.", 1210 ,440);
				g.drawString("Get $10 and go to shrek", 1210 ,460);
				ObjectManager.player1.muneez+=10;
				ObjectManager.player1.spaceValue = ObjectManager.spaces.get(14).id;
			}
			else if (chance == 46) {
				g.drawString("YOLO. Gain $1000 for swag.", 1210 ,440);
				ObjectManager.player1.muneez+=1000;
			}
			else if (chance >= 47&&chance<=50) {
				g.drawString("Ther is vegetal in my staekn. Lose $50", 1210 ,440);
				ObjectManager.player1.muneez-=50;
			}
			else if (chance >= 51&&chance<=55) {
				g.drawString("You stole Fizzy Lifting Drinks", 1210 ,440);
				g.drawString("and touched the ceiling.", 1210 ,460);
				g.drawString("You LOSE! You get NOTHING.", 1210 ,480);
				g.drawString("Lose $100 and all your chocolate", 1210 ,500);
				g.drawString("and go to Willy Wonka", 1210 ,520);
				ObjectManager.player1.muneez-=100;
				ObjectManager.player1.spaceValue = ObjectManager.spaces.get(21).id;
			}
		}
		g.setColor(Color.blue);
			if (ObjectManager.spaces.get(ObjectManager.player1.spaceValue).owner == 0) {
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
				g.setColor(Color.BLUE);
				g.drawString("This property is unowned", 1400 ,140);
				g.drawString("It costs "+(60 + (ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id * 20)) +" Dollars, and pays "+(60 + (ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id * 20)/2)+" when landed on.", 1400 ,160);
				g.drawString("Will you buy this property?", 1400 ,180);
				g.drawString("Type ''Y'' if yes, type ''N'' if no(ends turn).", 1400 ,200);
				g.drawString("Caps doesn't matter", 1400 ,220);
				}
			}
				if (ObjectManager.spaces.get(ObjectManager.player1.spaceValue).owner == 2) {
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
					g.setColor(Color.BLUE);
					g.drawString("This property is owned by another player", 1400 ,140);
					g.drawString("You must pay "+(60 + (ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id * 20)/2*ObjectManager.spaces.get(ObjectManager.player1.spaceValue).upgrade), 1400 ,160);
					ObjectManager.player1.muneez -= (60 + (ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id * 20)/2*ObjectManager.spaces.get(ObjectManager.player1.spaceValue).upgrade);
					ObjectManager.player2.muneez += (60 + (ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id * 20)/2*ObjectManager.spaces.get(ObjectManager.player1.spaceValue).upgrade);
					}
				}
				if (ObjectManager.spaces.get(ObjectManager.player1.spaceValue).owner == 1) {
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
					g.setColor(Color.BLUE);
					g.drawString("This property is owned by you", 1400 ,140);
					g.drawString("Would you like to upgrade this property for "+((ObjectManager.spaces.get(ObjectManager.player1.spaceValue).id * 20)/2), 1400 ,160);
					}
				}
		}
		if (ObjectManager.player1.spaceValue == ObjectManager.spaces.get(3).id) {
			g.drawString("You have landed on ''Taxes''", 1400 ,140);
			int taxChance = new Random().nextInt(25);
			if(taxChance==1) {
				g.drawString("and to our glorious president Trump", 1400 ,180);
				g.drawString("for a great wall.", 1400 ,200);
			}
				g.drawString("You must pay $200 to the government", 1400 ,160);
			ObjectManager.player1.muneez-=200;
		}
		ObjectManager.player1.x = ObjectManager.spaces.get(ObjectManager.player1.spaceValue).x + 5;
		// System.out.println(ObjectManager.spaces.get(ObjectManager.players.get(0).spaceValue).x+5);
		if (ObjectManager.player1.inJail == true) {
			ObjectManager.player1.x = ObjectManager.spaces.get(9).x+45;
		}
		ObjectManager.player1.y = ObjectManager.spaces.get(ObjectManager.player1.spaceValue).y + 5;
		// System.out.println(ObjectManager.spaces.get(ObjectManager.players.get(0).spaceValue).y+5);
		System.out.println("Space Value: " + ObjectManager.player1.spaceValue);
		
		try {
			this.image = ImageIO.read(this.getClass().getResourceAsStream(imageName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (image != null) {
			System.out.println("test");
			g.drawImage(image, x, y, null);
			System.out.println("In jail(p1): " + ObjectManager.player1.inJail);
			System.out.println("Space is on(p1): " + ObjectManager.player1.spaceValue);
			System.out.println("Turns til out of Jail(p1): " + ObjectManager.player1.RollsLeftUntilOutOfJail);
			System.out.println("Muneez(p1): "+muneez);
			System.out.println();
		}
		// if(label!=null) {

		// }
		//
	}
}

