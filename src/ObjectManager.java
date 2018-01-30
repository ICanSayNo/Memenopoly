import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	ArrayList<GameObject> objects;
	static ArrayList<Space> spaces = new ArrayList<Space>();
	static Player1 player1 =new Player1(100, 560, 150, 100, "troll.png", 0, false, 2000, 0);
	static Player2 player2 =new Player2(100, 560, 150, 100, "derp.png", 0, false, 2000, 0);
	static ArrayList<Dice> dice = new ArrayList<Dice>();
	int turn=0;
		
	ObjectManager() {
		dice = new ArrayList<Dice>();
		spaces = new ArrayList<Space>();
		initSpaces();
		
	}

	public void draw(Graphics g) {
		System.out.println();
		for (Space s : spaces) {
			s.draw(g);
			for (int i = 0; i < 32; i++) {
				if(spaces.get(i).owner!=0) {
					g.setColor(Color.BLACK);
				if(spaces.get(i).id==1||spaces.get(i).id==2||spaces.get(i).id==5||spaces.get(i).id==7||spaces.get(i).id==8) {
				g.drawString(("P"+spaces.get(i).owner+"  lvl"+spaces.get(i).upgrade), (spaces.get(i).x+20), (spaces.get(i).y+40));
					}
				else if(spaces.get(i).id==10||spaces.get(i).id==12||spaces.get(i).id==14||spaces.get(i).id==15) {
					g.drawString(("P"+spaces.get(i).owner+"  lvl"+spaces.get(i).upgrade), (spaces.get(i).x+95), (spaces.get(i).y+50));
						}
				else if(spaces.get(i).id==17||spaces.get(i).id==18||spaces.get(i).id==20||spaces.get(i).id==21||spaces.get(i).id==23||spaces.get(i).id==24) {
					g.drawString(("P"+spaces.get(i).owner+"  lvl"+spaces.get(i).upgrade), (spaces.get(i).x+20), (spaces.get(i).y+115));
						}
				else if(spaces.get(i).id==26||spaces.get(i).id==28||spaces.get(i).id==30||spaces.get(i).id==31) {
					g.drawString(("P"+spaces.get(i).owner+"  lvl"+spaces.get(i).upgrade), (spaces.get(i).x+5), (spaces.get(i).y+40));
				}
				
			}
			}
			
		}
		for (Dice d : dice) {

			d.draw(g);
		}

			player1.draw(g);
			g.drawString("P.1 Money: "+ObjectManager.player1.muneez, 1250 ,800);
			g.drawImage(player1.image, 1170, 780, null);

			player2.draw(g);
			g.drawString("P.2 Money: "+ObjectManager.player2.muneez, 1250 ,890);
			g.drawImage(player2.image, 1170, 860, null);
			
			if(ObjectManager.player1.muneez<=0) {
			System.out.println("Sum stuf is happenin");
				g.setColor(Color.gray);
				g.fillRect(0, 0, 1800, 950);
				g.setColor(Color.BLACK);
				g.drawString("PLAYER 1 HAS LOST!!!! OH NO!", 800, 425);
				g.drawString("Press R to Restart", 800, 440);
			}
			
			if(ObjectManager.player2.muneez<=0) {
				System.out.println("Sum stuf is happenin");
					g.setColor(Color.gray);
					g.fillRect(0, 0, 1800, 950);
					g.setColor(Color.BLACK);
					g.drawString("PLAYER 2 HAS LOST!!!! OH NO!", 800, 425);
					g.drawString("Press R to Restart", 800, 440);
	}
			if(ObjectManager.dice.get(0).value==10) {
				System.out.println("Sum stuf is happenin");
					g.setColor(new Color(203, 233, 228));
					g.fillRect(0, 0, 1800, 950);
					g.setColor(Color.BLACK);
					g.drawImage(MemeGamePanel.memenopolyImg, 650, 200, null);
					g.drawString("WELCOME TO MEMEOPOLY!", 800, 425);
					g.drawString("Press R to Start", 800, 440);
					g.drawString("Roll Dice using the ''Roll Dice'' Button", 800, 580);
					g.drawString("Follow instructions in player feed to buy", 800, 600);
					g.drawString("and use properties.", 800, 620);
					g.drawString("Force your opponent to go bankrupt to win!", 800, 640);
	}
	}

	public void initSpaces() {
		spaces.add(new Space(1000, 760, 150, 150, 1000, 760, "cerealGuy.png", null, null, 0, 0, 1));
		spaces.add(new Space(900, 760, 100, 150, 900, 819, "nyanCat.png", null, Color.orange.darker().darker(), 1, 0, 1));
		spaces.add(new Space(800, 760, 100, 150, 800, 819, "doge.jpeg", null, Color.orange.darker().darker(), 2, 0, 1));
		spaces.add(new Space(700, 760, 100, 150, 700, 760, "taxes.jpeg", null, null, 3, 0, 1));
		spaces.add(new Space(600, 760, 100, 150, 600, 760, "thomas.jpeg", null, null, 4, 0, 1));
		spaces.add(new Space(500, 760, 100, 150, 500, 819, "spongebob.jpeg", null, Color.CYAN.darker(), 5, 0, 1));
		spaces.add(new Space(400, 760, 100, 150, 400, 760, "block.jpeg", null, null, 6, 0, 1));
		spaces.add(new Space(300, 760, 100, 150, 300, 819, "squidward.jpg", null, Color.CYAN.darker(), 7, 0, 1));
		spaces.add(new Space(200, 760, 100, 150, 200, 819, "thisispatrick.jpg", null, Color.CYAN.darker(), 8, 0, 1));
		spaces.add(new Space(50, 760, 150, 150, 79, 760, "forever-alone-meme.jpg", null, null, 9, 0, 1));
		spaces.add(new Space(50, 660, 150, 100, 50, 660, "pingas.png", null, Color.magenta, 10, 0, 1));
		spaces.add(new Space(50, 560, 150, 100, 110, 560, "block2.jpeg", null, null, 11, 0, 1));
		spaces.add(new Space(50, 460, 150, 100, 50, 460, "sanic.png", null, Color.magenta, 12, 0, 1));
		spaces.add(new Space(50, 360, 150, 100, 110, 360, "percy.jpeg", null, null, 13, 0, 1));
		spaces.add(new Space(50, 260, 150, 100, 50, 260, "shrek.jpg", null, Color.orange, 14, 0, 1));
		spaces.add(new Space(50, 160, 150, 100, 50, 160, "barryBeeBenson.jpeg", null, Color.orange, 15, 0, 1));
		spaces.add(new Space(50, 10, 150, 150, 50, 10, "freeParking.jpg", null, null, 16, 0, 1));
		spaces.add(new Space(200, 10, 100, 150, 200, 10, "teletubbies.jpg", null, Color.red, 17, 0, 1));
		spaces.add(new Space(300, 10, 100, 150, 300, 10, "elmo.jpeg", null, Color.RED, 18, 0, 1));
		spaces.add(new Space(400, 10, 100, 150, 400, 70, "block3.jpeg", null, null, 19, 0, 1));
		spaces.add(new Space(500, 10, 100, 150, 500, 10, "poohbear.png", null, Color.red, 20, 0, 1));
		spaces.add(new Space(600, 10, 100, 150, 600, 10, "WillyWonka.jpg", null, Color.YELLOW, 21, 0, 1));
		spaces.add(new Space(700, 10, 100, 150, 700, 70, "gordon.jpg", null, null, 22, 0, 1));
		spaces.add(new Space(800, 10, 100, 150, 800, 10, "futurama.jpeg", null, Color.yellow, 23, 0, 1));
		spaces.add(new Space(900, 10, 100, 150, 900, 10, "philosoraptor.jpeg", null, Color.yellow, 24, 0, 1));
		spaces.add(new Space(1000, 10, 150, 150, 1000, 10, "fidgetSpinner.jpeg", null, null, 25, 0, 1));
		spaces.add(new Space(1000, 160, 150, 100, 1060, 160, "YEE.jpeg", null, Color.GREEN, 26, 0, 1));
		spaces.add(new Space(1000, 260, 150, 100, 1000, 260, "block4.jpeg", null, null, 27, 0, 1));
		spaces.add(new Space(1000, 360, 150, 100, 1060, 360, "HeMan.jpeg", null, Color.GREEN, 28, 0, 1));
		spaces.add(new Space(1000, 460, 150, 100, 1000, 460, "james.jpeg", null, null, 29, 0, 1));
		spaces.add(new Space(1000, 560, 150, 100, 1060, 560, "ikeaCat.jpeg", null, Color.BLUE, 30, 0, 1));
		spaces.add(new Space(1000, 660, 150, 100, 1060, 660, "grumpyCat.jpg", null, Color.blue, 31, 0, 1));

		dice.add(new Dice(1000, 560, 150, 100, 1660, 660, "diec-1.gif", 10));
		dice.add(new Dice(1000, 660, 150, 100, 1560, 660, "diec-1.gif", 0));
		dice.add(new Dice(1000, 660, 150, 100, 1480, 760, "roll.png", 0));
		

	}
}
