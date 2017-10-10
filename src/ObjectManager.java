import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	ArrayList<GameObject> objects;
	ArrayList<Space> spaces=new ArrayList<Space>() ;
	ObjectManager(){
		initSpaces();
	}
	
	public void draw(Graphics g){
		for (Space s : spaces) {
			s.draw(g);
		}
	}
	
public void initSpaces() {
	spaces.add(new Space(50,760,150,150, 79, 760, "forever-alone-meme.jpg", null, null));
	spaces.add(new Space(200,760,100,150, 200, 819, "thisispatrick.jpg", null, Color.CYAN.darker()));
	spaces.add(new Space(300,760,100,150, 300, 819, "squidward.jpg", null, Color.CYAN.darker()));
	spaces.add(new Space(400,760,100,150, 400, 760, "block.jpeg", null, null));
	spaces.add(new Space(500,760,100,150, 500, 819, "spongebob.jpeg", null, Color.CYAN.darker()));
	spaces.add(new Space(600,760,100,150, 600, 760, "thomas.jpeg", null, null));
	spaces.add(new Space(700,760,100,150, 700, 760, "taxes.jpeg", null, null));
	spaces.add(new Space(800,760,100,150, 800, 819, "doge.jpeg", null, Color.MAGENTA.darker()));
	spaces.add(new Space(900,760,100,150, 900, 819, "nyanCat.png", null, Color.MAGENTA.darker()));
	spaces.add(new Space(1000,760,150,150, 1000, 760, "cerealGuy.png", null, null));
	spaces.add(new Space(50,10,150,150, 50, 10, "freeParking.jpg", null, null));
	spaces.add(new Space(200,10,100,150, 0, 0, null, null, null));
	spaces.add(new Space(300,10,100,150, 0, 0, null, null, null));
	spaces.add(new Space(400,10,100,150, 0, 0, null, null, null));
	spaces.add(new Space(500,10,100,150, 0, 0, null, null, null));
	spaces.add(new Space(600,10,100,150, 0, 0, null, null, null));
	spaces.add(new Space(700,10,100,150, 0, 0, null, null, null));
	spaces.add(new Space(800,10,100,150, 0, 0, null, null, null));
	spaces.add(new Space(900,10,100,150, 0, 0, null, null, null));
	spaces.add(new Space(1000,10,150,150, 1000, 10, "fidgetSpinner.jpeg", null, null));
	spaces.add(new Space(50,160,150,100, 0, 0, null, null, null));
	spaces.add(new Space(50,260,150,100, 0, 0, null, null, null));
	spaces.add(new Space(50,360,150,100, 0, 0, null, null, null));
	spaces.add(new Space(50,460,150,100, 0, 0, null, null, null));
	spaces.add(new Space(50,560,150,100, 0, 0, null, null, null));
	spaces.add(new Space(50,660,150,100, 0, 0, null, null, null));
	spaces.add(new Space(1000,160,150,100, 0, 0, null, null, null));
	spaces.add(new Space(1000,260,150,100, 0, 0, null, null, null));
	spaces.add(new Space(1000,360,150,100, 0, 0, null, null, null));
	spaces.add(new Space(1000,460,150,100, 0, 0, null, null, null));
	spaces.add(new Space(1000,560,150,100, 0, 0, null, null, null));
	spaces.add(new Space(1000,660,150,100, 0, 0, null, null, null));
}
}

