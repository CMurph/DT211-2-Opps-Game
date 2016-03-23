package com.gamefiles;

import java.awt.Canvas;

public class Game extends Canvas implements Runnable 
{

	private Thread gameThread; //Threads are like a subprocess and will allow our game to multitask
	private boolean running = false;
	
	public Game(){
			
		//	Window frame = new Window("gameNamehere" );
		}
	
	public synchronized void startGame()
	{
		running=true;
		gameThread=new Thread(this, "Gamenamehere");
		gameThread.start(); //this triggers the run() method
	}
	
	public synchronized void stopGame()
	{ //closes the game
		running = false;
		try
		{
			gameThread.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() 
	{
		while (running)
		{ //while program is running keep doing this
		
		}
	}
}
