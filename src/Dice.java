import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Dice extends GameObject{
	int imgx;
	int imgy;
	public BufferedImage image;
	//JLabel label= new JLabel();
	Dice(int x, int y, int width, int height, int imgx, int imgy, String imageName){
		super(x, y, width, height);
		this.imgx=imgx;
		this.imgy=imgy;
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
static void roll() {
	ObjectManager.dice.get(2);
}

	void draw(Graphics g) {


		if(image!=null) {
			g.drawImage(image, imgx+1, imgy+1, null);
		}
		//if(label!=null) {
		  	
		//}
	}
}


