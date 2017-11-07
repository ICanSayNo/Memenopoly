import java.awt.Color;

import javax.swing.JFrame;

public class Memenopoly {
	static JFrame frame;
	final static int frameHeight=950;
	final static int frameWidth=1800;
	MemeGamePanel gamePanel;
	public Memenopoly() {
		frame = new JFrame();
		gamePanel = new MemeGamePanel();
		frame.addKeyListener(gamePanel);
		setup();
		frame.addMouseListener(gamePanel);
		frame.setBackground( new Color(203, 233, 228) );
	}
	public static void main(String[] args) {
		Memenopoly m = new Memenopoly();
	}
	void setup() {
		frame.add(gamePanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(frameWidth, frameHeight);
		gamePanel.startGame();
		
	}
}
