package com.gamefiles;


public class Main {
static int i=0;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Character Charlie = new Character("Hero",1, 10, 6, 5, 2);
		Character Goblin = new Character("Goblin",2, 12, 4, 3, 5);
		Battle game = new Battle(Charlie, Goblin);
		
	//	System.out.println(Charlie.getName() + Charlie.getCurrentHp());
//	-	System.out.println(Goblin.getName() + Goblin.getCurrentHp());
		game.battlePhase();
		Window frame = new Window("title");
	}
}