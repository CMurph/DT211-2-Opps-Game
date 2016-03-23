package com.gamefiles;

public class Character {

	private String name;
	private int hp; //hitpoints
	private int currentHp;
	private int atk; //Attack
	private int def; //Defense
	private int spd; //Speed
	private int lvl; //Level
	
	
	
	
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

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	
	
	public Character(String name, int lvl, int hp, int atk, int def, int spd){
		
		setName(name);
		setLvl(lvl);
		setHp(hp);
		setAtk(atk);
		setDef(def);
		setSpd(spd);
		setCurrentHp(hp);

		
		
	}
}
	
	

