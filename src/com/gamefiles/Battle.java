package com.gamefiles;

public class Battle{

boolean gameover = false;
Character attacker;
Character defender;
Character dummy;


	public void attackPhase(){
		
		int base = 4;
		int damage;
		damage = ((2*attacker.getLvl()+10)/25)*(attacker.getAtk()/defender.getDef())*base+2;//damage equation based off pokémons
		defender.setCurrentHp(defender.getCurrentHp()-damage);
		
		System.out.println(attacker.getName()+" attacks " + defender.getName() + " with " + damage + " Damage. " +defender.getName()+ " has " + defender.getCurrentHp() + "/" + defender.getHp()+ "HP");
		//System.out.println("Attacker" + attacker.getCurrentHp()+ "/"+ attacker.getHp()+ "       Defender" + defender.getCurrentHp()+"/"+defender.getHp());
	}
	
	public Battle(Character hero, Character baddie){
	
		//at start of battle assign who goes first based on Speed
		if (hero.getSpd()==baddie.getSpd()){ //if both characters have equal speed we randomly assign the initial attacker
			
			if (System.currentTimeMillis()%2==0){
				attacker = hero;
				defender = baddie;
			}
			else{
				attacker = baddie;
				defender = hero;
			}
		}
		if (hero.getSpd()> baddie.getSpd()){ //if hero faster
			
			attacker = hero;
			defender = baddie;
			
		}
		if (hero.getSpd()<baddie.getSpd()){ //if hero slower
			
			attacker = baddie;
			defender = hero; 
		}
		
		System.out.println("hero:" + hero.getName());
		System.out.println("Baddie:" + baddie.getName());
		System.out.println("attacker:" + attacker.getName());
		System.out.println("defender:" + defender.getName());
				
	}
	
	
	public void battlePhase(){
		//System.out.println("Before da loop");
		while(attacker.getCurrentHp()> 0 && defender.getCurrentHp()> 0){ //while both characters have health the battle continues
			
		//	System.out.println("battlePhase Begins");
			attackPhase();
			//switch roles
			dummy=attacker;
			attacker=defender;
			defender=dummy;
		}
		

		
	}
}
	

