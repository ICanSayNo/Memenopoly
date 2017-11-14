import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Player extends GameObject{
	int imgx;
	int imgy;
	int spaceValue;
	boolean inJail;
	public static BufferedImage image;
	String imageName;
	int muneez;
	//JLabel label= new JLabel();
	Player(int x, int y, int width, int height, String imageName, int spaceValue, boolean inJail, int muneez){
		super(x, y, width, height);
		this.spaceValue=spaceValue;
		this.imageName=imageName;
		this.inJail=inJail;
		this.muneez=muneez;
		if(imageName!=null) {
			try {
				this.image = ImageIO.read(this.getClass().getResourceAsStream(imageName));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		//if(label!=null) {
		//	Font font = new Font("Impact", Font.BOLD, 15);
		//	this.label.setText(label);
		//	this.label.setFont(font);
		//}
		}
	void draw(Graphics g) {
		ObjectManager.players.get(0).x=ObjectManager.spaces.get(ObjectManager.players.get(0).spaceValue).x+5;
		//System.out.println(ObjectManager.spaces.get(ObjectManager.players.get(0).spaceValue).x+5);
		ObjectManager.players.get(0).y=ObjectManager.spaces.get(ObjectManager.players.get(0).spaceValue).y+5;
		//System.out.println(ObjectManager.spaces.get(ObjectManager.players.get(0).spaceValue).y+5);
		if(ObjectManager.players.get(0).spaceValue==ObjectManager.spaces.get(20).id) {
			ObjectManager.players.get(0).inJail=true;
			ObjectManager.players.get(0).spaceValue=ObjectManager.spaces.get(1).id;
			
		}
		try {
			this.image = ImageIO.read(this.getClass().getResourceAsStream(imageName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(image!=null) {
			g.drawImage(image, x, y, null);
			System.out.println("In jail: "+ObjectManager.players.get(0).inJail);
			System.out.println("Space p1 is on: "+ObjectManager.players.get(0).spaceValue);
			System.out.println("");
		}
		//if(label!=null) {
		  	
		//}
	}
}
