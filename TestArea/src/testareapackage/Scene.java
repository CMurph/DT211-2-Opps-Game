package testareapackage;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class Scene extends JComponent {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
Image img;
Image img2;
Image bg;
Image deadGoblin;


	
	public void paint(Graphics g){
		getImage();
		g.drawImage(bg, 0, 0, this);
	}

	
	private void getImage(){
		try{
			BufferedImage goblin = ImageIO.read(new File("images/goblin.png"));
			BufferedImage hero = ImageIO.read(new File("images/hero.png"));
			BufferedImage bg = ImageIO.read(new File("images/bg.png"));
			BufferedImage deadGoblin = ImageIO.read(new File("images/deadgoblin.png"));
			img = goblin;
			img2= hero;
			this.bg=bg;
			this.deadGoblin=deadGoblin;
		}
		catch(IOException e)
		{e.printStackTrace();
		}
	}
	public void draw(Graphics g, Character char1, Character char2){
		
		char1.Draw(g);
		char2.Draw(g);
	}


		
}
