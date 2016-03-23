package com.gamefiles;

import java.awt.Dimension;
import java.awt.Image;

import javax.swing.JFrame;

public class Window extends JFrame {

	private static int width = 300;
	private static int height = width / 16 * 9;
	private static int scale = 6;
	private Image character;

	public Window(String title) {
		JFrame frame = new JFrame(title);

		
		
		add(new PlayableCharacter());
		frame.setSize(new Dimension(width * scale, height * scale));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
	}
}