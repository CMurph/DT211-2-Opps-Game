package com.gamefiles;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class PlayableCharacter {

	String name;
	int hp; //hitpoints
	int atk; //Attack
	int def; //Defense
	private int spd; //Speed
	private Image character;
	
	
	
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



	
	
	
	
	public PlayableCharacter(String name, int hp, int atk, int def, int spd){
		
		setHp(hp);
		setAtk(atk);
		setDef(def);
		setSpd(spd);

		}

	public PlayableCharacter(){
		ImageIcon ii = new ImageIcon("charcter.png");
		character=ii.getImage();
	}
	
	public void paintComponent(Graphics g){
		g.drawImage(character,0, 0, null);
	}
}

	
	

