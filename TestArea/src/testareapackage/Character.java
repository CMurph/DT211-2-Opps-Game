package testareapackage;


import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class Character extends JComponent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;

	private int hp; //hitpoints
	private int currentHp;
	private int atk; //Attack
	private int spd; //Speed
	private int lvl; //Level
	private boolean attacking;
	protected BufferedImage idleImg;

	protected BufferedImage deadImg;

	protected BufferedImage attackingImg;
	

	
	
	

	public boolean isAttacking() {
		return attacking;
	}

	public void setAttacking(boolean attacking) {
		this.attacking = attacking;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}


	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getCurrentHp() {
		return currentHp;
	}

	public void setCurrentHp(int currentHp) {
		this.currentHp = currentHp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getSpd() {
		return spd;
	}

	public void setSpd(int spd) {
		this.spd = spd;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public Character(){ //baddies use a blank constructor as there stats are random
		System.out.println("CharacterClass");
	};
	
	public Character(String name, int lvl, int hp, int atk, int spd){
		
		setName(name);
		setLvl(lvl);
		setHp(hp);
		setAtk(atk);
		setSpd(spd);
		setCurrentHp(hp);
		loadImages();
	
		
	}
	
	
	public void loadImages(){
		System.out.println("loading images for -"+getName());
		try{
			System.out.println("loading images for -"+getName());
			attackingImg = ImageIO.read(new File("image/impAttacking.png"));
			System.out.println("attacking success -"+getName());
			idleImg = ImageIO.read(new File("images/imp.png"));
			System.out.println("idle success -"+getName());
			deadImg = ImageIO.read(new File("images/impDead.png"));
			System.out.println("dead success -"+getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void Draw(Graphics g){
		
		//character not the hero we draw them on the other side of the screen
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
	}
}
	
	

