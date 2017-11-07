import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Player extends GameObject{
	int imgx;
	int imgy;
	int spaceValue;
	public static BufferedImage image;
	String imageName;
	//JLabel label= new JLabel();
	Player(int x, int y, int width, int height, String imageName, int spaceValue){
		super(x, y, width, height);
		this.spaceValue=spaceValue;
		this.imageName=imageName;
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
		System.out.println(ObjectManager.spaces.get(ObjectManager.players.get(0).spaceValue).x+5);
		ObjectManager.players.get(0).y=ObjectManager.spaces.get(ObjectManager.players.get(0).spaceValue).y+5;
		System.out.println(ObjectManager.spaces.get(ObjectManager.players.get(0).spaceValue).y+5);
		try {
			this.image = ImageIO.read(this.getClass().getResourceAsStream(imageName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(image!=null) {
			g.drawImage(image, x, y, null);
		}
		//if(label!=null) {
		  	
		//}
	}
}
