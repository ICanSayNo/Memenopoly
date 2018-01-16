import java.awt.Color;

import javax.swing.JFrame;

public class Memenopoly {
	static JFrame frame;
	final static int frameHeight = 950;
	final static int frameWidth = 1800;
	static MemeGamePanel gamePanel;

	public Memenopoly() {
			}

	public static void main(String[] args) {
		frame = new JFrame();
		setup();
		frame.addMouseListener(gamePanel);
		frame.setBackground(new Color(203, 233, 228));

	}

	static void setup() {
		gamePanel = new MemeGamePanel();
		frame.addKeyListener(gamePanel);
		frame.add(gamePanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(frameWidth, frameHeight);
		gamePanel.startGame();

	}
}
