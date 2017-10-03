import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;

public class Space extends GameObject{
	static Color defaultColor = Color.WHITE;
	Color spaceColor;
	public BufferedImage image;
	//JLabel label= new JLabel();
	Space(int x, int y, int width, int height, String imageName, String label){
		super(x, y, width, height);
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
		if (spaceColor==null) {
			spaceColor=Space.defaultColor;
		}
		g.setColor(Color.black);
		g.drawRect(x, y, width, height);
		g.setColor(spaceColor);
		g.fillRect(x+1, y+1, width-2, height-2);
		if(image!=null) {
			g.drawImage(image, x+1, y+1, null);
		}
		//if(label!=null) {
		  	
		//}
	}
}


