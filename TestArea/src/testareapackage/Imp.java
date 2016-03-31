package testareapackage;

import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Imp extends Baddie {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2763591188147409478L;
	private Random random;
	
	public Imp(){
		super();

		System.out.println("Imp Class");
		setName("imp");
		int temp;
		temp = random.nextInt(2)+1;
		setLvl(temp);
		temp = random.nextInt(2)+getLvl()+6;//imps have less health
		setHp(temp);
		setCurrentHp(getHp());
		temp = random.nextInt(2)+getLvl();
		setAtk(temp);
		temp = random.nextInt(2)+getLvl()+3;//imps are fast
		setSpd(temp);
		System.out.println("about to load images for imp");
		System.out.println("about to load images for imp");
		loadImages();
	}
	
	
	public void loadImages(){
		System.out.println("loading images for -"+getName());
		try{
			System.out.println("loading images for -"+getName());
			attackingImg = ImageIO.read(new File("image/"+getName()+"Attacking.png"));
			System.out.println("attacking success -"+getName());
			idleImg = ImageIO.read(new File("images/"+getName()+".png"));
			System.out.println("idle success -"+getName());
			deadImg = ImageIO.read(new File("images/"+getName()+"Dead.png"));
			System.out.println("dead success -"+getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void Draw(Graphics g){
		
		if(getName()=="hero")
		{
			if(getCurrentHp()>0 && isAttacking()){
				g.drawImage(attackingImg, 20, 200, this);
			}
			 if(getCurrentHp()>0){
				g.drawImage(idleImg, 20, 200, this);
			}
			else{
				g.drawImage(deadImg, 20, 200, this);
			}
		}
	else{ //character not the hero we draw them on the other side of the screen
			if(getCurrentHp()>0 && isAttacking()){
				g.drawImage(attackingImg, 20, 200, this);
		//	}
			if(getCurrentHp()>0){
				g.drawImage(idleImg, 800, 200, this);
			}
			else{
				g.drawImage(deadImg, 800, 200, this);
				}
			}
		}//end of baddie else
	}

}
