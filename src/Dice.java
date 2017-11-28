import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Dice extends GameObject {
	int imgx;
	int imgy;
	int value;
	public static BufferedImage image;
	String imageName;

	// JLabel label= new JLabel();
	Dice(int x, int y, int width, int height, int imgx, int imgy, String imageName, int value) {
		super(x, y, width, height);
		this.imgx = imgx;
		this.imgy = imgy;
		this.value = value;
		this.imageName = imageName;
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

	static void roll() {
			ObjectManager.dice.get(1).value = new Random().nextInt(6);
			System.out.println("Dice 1 Value: " + (ObjectManager.dice.get(1).value + 1));
			ObjectManager.dice.get(0).value = new Random().nextInt(6);
			System.out.println("Dice 2 Value: " + (ObjectManager.dice.get(0).value + 1));
		}

	void draw(Graphics g) {

		try {
			this.image = ImageIO.read(this.getClass().getResourceAsStream(imageName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (image != null) {
			g.drawImage(image, imgx + 1, imgy + 1, null);
		}
		// if(label!=null) {

		// }
	}
}
