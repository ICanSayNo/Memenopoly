import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Spaces extends GameObject{
	Spaces(int x, int y, int width, int height){
		super(x, y, width, height);
		}
	

	void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawRect(x, y, width, height);
	}
}

