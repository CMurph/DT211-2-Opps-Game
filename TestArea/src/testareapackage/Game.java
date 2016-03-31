package testareapackage;

import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Game extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean running;
 	private Character hero;
	private Character baddie;
	private BattleSystem battle = new BattleSystem();
	

	public void start(){
		running=true;
		System.out.println("stepB");
		hero= new Character("hero", 1, 10, 2, 2);
		while (running){
			gameloop();
		}
	}
	
	@Override
	public void paintComponent(Graphics g){
		
		battle.draw(g);
		hero.Draw(g);
		baddie.Draw(g);
	}
	
	public void randomBaddie(){
		System.out.println("RandomBaddie");
		Random random = new Random();
		int baddie = 1; //random.nextInt(2);
		if (baddie==0){
			this.baddie=new Goblin();
		}
		if (baddie==1){
			this.baddie=new Imp();
		}
		System.out.println("random baddie() finished");
	}
	
	void gameloop(){
		System.out.println("Gameloop");
		randomBaddie();
		battle.battle(hero, baddie, this);
		System.out.println("battleover");
		if(hero.getCurrentHp()<=0){
			running=false;
		}
	}
}

