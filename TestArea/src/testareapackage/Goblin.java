package testareapackage;

import java.util.Random;

public class Goblin extends Baddie{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6044230415327538356L;
	private Random random;

	public Goblin(){
		super();
		setName("goblin");
		int temp;
		temp = random.nextInt(2)+1;
		setLvl(temp);
		temp = random.nextInt(2)+getLvl()+8;//goblins have more health
		setHp(temp);
		setCurrentHp(getHp());
		temp = random.nextInt(2)+getLvl();
		setAtk(temp);
		temp = random.nextInt(2)+getLvl()-1;//goblins are slow
		setSpd(temp);
		loadImages();
	}
	



}
