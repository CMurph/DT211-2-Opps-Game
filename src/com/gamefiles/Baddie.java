package com.gamefiles;

public class Baddie {

	String name;
	int hp; //hitpoints
	int atk; //Attack
	int def; //Defense
	private int spd; //Speed
	
	
	
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


	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}


	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}


	public int getSpd() {
		return spd;
	}

	public void setSpd(int spd) {
		this.spd = spd;
	}



	
	
	
	
	public Baddie(String name, int hp, int atk, int def, int spd){
		
		setHp(hp);
		setAtk(atk);
		setDef(def);
		setSpd(spd);
		
		
		
		
		
		
	}
}
	