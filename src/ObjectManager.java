import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	ArrayList<GameObject> objects;
	static ArrayList<Space> spaces = new ArrayList<Space>();
	static ArrayList<Player1> player1 = new ArrayList<Player1>();
	static ArrayList<Player2> player2 = new ArrayList<Player2>();
	static ArrayList<Dice> dice = new ArrayList<Dice>();
	int turn=0;
	ObjectManager() {
		initSpaces();
	}

	public void draw(Graphics g) {
		for (Space s : spaces) {
			s.draw(g);
		}
		for (Dice d : dice) {

			d.draw(g);
		}
		for (Player1 p : player1) {

			p.draw(g);
		}
		for (Player2 p : player2) {

			p.draw(g);
		}
	}

	public void initSpaces() {
		spaces.add(new Space(1000, 760, 150, 150, 1000, 760, "cerealGuy.png", null, null, 0, 0));
		spaces.add(new Space(900, 760, 100, 150, 900, 819, "nyanCat.png", null, Color.orange.darker().darker(), 1, 0));
		spaces.add(new Space(800, 760, 100, 150, 800, 819, "doge.jpeg", null, Color.orange.darker().darker(), 2, 0));
		spaces.add(new Space(700, 760, 100, 150, 700, 760, "taxes.jpeg", null, null, 3, 0));
		spaces.add(new Space(600, 760, 100, 150, 600, 760, "thomas.jpeg", null, null, 4, 0));
		spaces.add(new Space(500, 760, 100, 150, 500, 819, "spongebob.jpeg", null, Color.CYAN.darker(), 5, 0));
		spaces.add(new Space(400, 760, 100, 150, 400, 760, "block.jpeg", null, null, 6, 0));
		spaces.add(new Space(300, 760, 100, 150, 300, 819, "squidward.jpg", null, Color.CYAN.darker(), 7, 0));
		spaces.add(new Space(200, 760, 100, 150, 200, 819, "thisispatrick.jpg", null, Color.CYAN.darker(), 8, 0));
		spaces.add(new Space(50, 760, 150, 150, 79, 760, "forever-alone-meme.jpg", null, null, 9, 0));
		spaces.add(new Space(50, 660, 150, 100, 50, 660, "pingas.png", null, Color.magenta, 10, 0));
		spaces.add(new Space(50, 560, 150, 100, 110, 560, "block2.jpeg", null, null, 11, 0));
		spaces.add(new Space(50, 460, 150, 100, 50, 460, "sanic.png", null, Color.magenta, 12, 0));
		spaces.add(new Space(50, 360, 150, 100, 110, 360, "percy.jpeg", null, null, 13, 0));
		spaces.add(new Space(50, 260, 150, 100, 50, 260, "shrek.jpg", null, Color.orange, 14, 0));
		spaces.add(new Space(50, 160, 150, 100, 50, 160, "barryBeeBenson.jpeg", null, Color.orange, 15, 0));
		spaces.add(new Space(50, 10, 150, 150, 50, 10, "freeParking.jpg", null, null, 16, 0));
		spaces.add(new Space(200, 10, 100, 150, 200, 10, "teletubbies.jpg", null, Color.red, 17, 0));
		spaces.add(new Space(300, 10, 100, 150, 300, 10, "elmo.jpeg", null, Color.RED, 18, 0));
		spaces.add(new Space(400, 10, 100, 150, 400, 70, "block3.jpeg", null, null, 19, 0));
		spaces.add(new Space(500, 10, 100, 150, 500, 10, "poohbear.png", null, Color.red, 20, 0));
		spaces.add(new Space(600, 10, 100, 150, 600, 10, "WillyWonka.jpg", null, Color.YELLOW, 21, 0));
		spaces.add(new Space(700, 10, 100, 150, 700, 70, "gordon.jpg", null, null, 22, 0));
		spaces.add(new Space(800, 10, 100, 150, 800, 10, "futurama.jpeg", null, Color.yellow, 23, 0));
		spaces.add(new Space(900, 10, 100, 150, 900, 10, "philosoraptor.jpeg", null, Color.yellow, 24, 0));
		spaces.add(new Space(1000, 10, 150, 150, 1000, 10, "fidgetSpinner.jpeg", null, null, 25, 0));
		spaces.add(new Space(1000, 160, 150, 100, 1060, 160, "YEE.jpeg", null, Color.GREEN, 26, 0));
		spaces.add(new Space(1000, 260, 150, 100, 1000, 260, "block4.jpeg", null, null, 27, 0));
		spaces.add(new Space(1000, 360, 150, 100, 1060, 360, "HeMan.jpeg", null, Color.GREEN, 28, 0));
		spaces.add(new Space(1000, 460, 150, 100, 1000, 460, "james.jpeg", null, null, 29, 0));
		spaces.add(new Space(1000, 560, 150, 100, 1060, 560, "ikeaCat.jpeg", null, Color.BLUE, 30, 0));
		spaces.add(new Space(1000, 660, 150, 100, 1060, 660, "grumpyCat.jpg", null, Color.blue, 31, 0));

		dice.add(new Dice(1000, 560, 150, 100, 1660, 660, "diec-1.gif", 0));
		dice.add(new Dice(1000, 660, 150, 100, 1560, 660, "diec-1.gif", 0));
		dice.add(new Dice(1000, 660, 150, 100, 1480, 760, "roll.png", 0));
		player1.add(new Player1(100, 560, 150, 100, "troll.png", 0, false, 2000, 0));
		player2.add(new Player2(100, 560, 150, 100, "troll.png", 0, false, 2000, 0));
	}
}
