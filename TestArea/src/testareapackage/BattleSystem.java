




package testareapackage;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class BattleSystem {

	private Character firstChar, secondChar;
	private Random random = new Random();
	private int damage;
	private Image bg;
	private Game game;


//instance of a battle
	public void battle(Character charA, Character charB, Game game){
		this.game=game;
		System.out.println("battle activate!");
		initialise(charA, charB);
		game.repaint();
		
		
		
		while(firstChar.getCurrentHp()>0 && secondChar.getCurrentHp()>0){
			System.out.println(firstChar.getName()+" is attacking");
			firstChar.setAttacking(true);
			secondChar.setAttacking(false);
			game.repaint();
			wait1sec();
			damage=random.nextInt(5)+firstChar.getAtk();
			secondChar.setCurrentHp(secondChar.getCurrentHp()-damage); //take damage value from value HP
			System.out.println(firstChar.getName()+" "+firstChar.getCurrentHp()+"/"+firstChar.getHp());
			System.out.println(secondChar.getName()+" "+secondChar.getCurrentHp()+"/"+secondChar.getHp());


			if(firstChar.getCurrentHp()>0 && secondChar.getCurrentHp()>0){//Safety check to prevent a dead char2 from attacking
				System.out.println(secondChar.getName()+" is attacking");
				firstChar.setAttacking(false);
				secondChar.setAttacking(true);
				game.repaint();
				wait1sec();
				damage=random.nextInt(5)+secondChar.getAtk();
				firstChar.setCurrentHp(firstChar.getCurrentHp()-damage); //take damage value from value HP
				System.out.println(firstChar.getName()+" "+firstChar.getCurrentHp()+"/"+firstChar.getHp());
				System.out.println(secondChar.getName()+" "+secondChar.getCurrentHp()+"/"+secondChar.getHp());

			}//end of if
		}//end of while
		game.repaint();
		wait1sec();

	}//end of battle()
	
	
	public void initialise(Character charA, Character charB){
		
		System.out.println("battleinitialise");
		try{
			System.out.println("stepBattleIMageBuffered");
			BufferedImage bg = ImageIO.read(new File("images/bg.png"));
			this.bg=bg;
		}
		catch(IOException e)
		{e.printStackTrace();
		}
		
		//initiative values are rolled for each char, 0-20+characters speed
		int charAInit=(random.nextInt(20)+charA.getSpd());
		int charBInit=(random.nextInt(20)+charB.getSpd());
		
		//if both characters have the same initiative value
		if(charAInit==charBInit){
			if(random.nextInt(2)==1){//pick on at random
				firstChar=charA;
				secondChar=charB;
			}
			else{
				firstChar=charB;
				secondChar=charA;
			}
		}
		else if(charAInit>charBInit){//if charA is faster
			firstChar=charA;
			secondChar=charB;
		}
		else{//if charB is faster
			firstChar=charB;
			secondChar=charA;
		}
	}//end of initialise()
	
	
	
	
	public void wait1sec(){
		try{
			Thread.sleep(1500);
		}catch(InterruptedException e){
			Thread.currentThread().interrupt();
		}
	}
	
	
	public void draw(Graphics g){
		g.drawImage(bg, 0, 0, null);
	}
}

