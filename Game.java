package project.ashik.firstgame;

import project.ashik.firstgame.display.Display;

public class Game implements Runnable {
	
	private Display display;
	public int width,height;
	public String title;
	
	private boolean running = false;
	private Thread thread;
	
	public Game(String title,int width,int height){
		this.width= width;
		this.height=height;
		this.title=title;
		display = new Display(title,width,height);
	}
	private void init(){
		
	}
	
	private void tick(){
		
	}
	private void render(){
		
	}
	public void run(){
		
		init();
		while (running){
			tick();
			render();
		}
		
	}
	public synchronized void start(){
		if (running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	public synchronized void stop(){
		if(!running)
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
//create buffers and drawing
