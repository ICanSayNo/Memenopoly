import java.awt.Color;
import java.awt.Graphics;

public class Image extends GameObject  {
		Image(int x, int y, int width, int height){
			super(x, y, width, height);
		}


		void draw(Graphics g) {
			
			if(MemeGamePanel.memenopolyImg!=null) {
			g.drawImage(MemeGamePanel.memenopolyImg, x+380, y+380, null);
			}
		
		}
			

}
