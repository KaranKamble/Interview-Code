package test;

import java.lang.Thread.State;


class Task implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Running run()");
	}
}
public class Program {
	
	public static void main(String[] args) {
		Runnable target = new Task();
		Thread thread = new Thread(target);
		thread.start();
	}

	
	
	public static void main1(String[] args) {
			State[] states = State.values();
			for( State state : states)
				System.out.printf("%-5d%-20s\n",state.ordinal(),state.name());
	}
}
