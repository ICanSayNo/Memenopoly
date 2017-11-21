import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	int imgx;
	int imgy;

	GameObject(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	void update() {
	}

	void draw(Graphics g) {
		Font stringFont = new Font( "Comic Sans MS", Font.PLAIN, 18 );
	}
}
