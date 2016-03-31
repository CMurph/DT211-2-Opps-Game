package testareapackage;

import javax.swing.JFrame;


public class main {

	public static void main(String args[]){
		

		JFrame frame = new JFrame();
		Game game = new Game();
		


		// TODO Auto-generated method stub
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(1600, 900);
	    frame.setVisible(true);
		frame.add(game);
		game.start();
	}	
}


