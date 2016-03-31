package testareapackage;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class Hero extends JComponent {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
Image img;
	
	public void paint(Graphics g){
		getImage();
		g.drawImage(img, 20, 20, this);
	}
	
	private void getImage(){
		try{
			BufferedImage bufferedImg = ImageIO.read(new File("images/hero.png"));
			img = bufferedImg;
		}
		catch(IOException e)
		{e.printStackTrace();
		}


	}
		
}
