package main;

public class RunTicker extends Thread{
	static int delay = 500;
	static boolean running=false;
	static void setDelay(int d){
		delay = d;
		
	}
    @Override
	public void run(){
		running=true;
		while(running){
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Main.calcNext();
		Main.M.painting=true;
		
		Main.M.repaint();
		while(Main.M.ip()){}
		}
	}
}