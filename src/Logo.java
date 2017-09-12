import java.awt.Color;
import java.awt.Graphics;

public class Logo extends GameObject  {
		Logo(int x, int y, int width, int height){
			super(x, y, width, height);
		}


		void draw(Graphics g) {
			g.drawImage(MemeGamePanel.memenopolyImg, x, y, width, height, null);
		}

}
