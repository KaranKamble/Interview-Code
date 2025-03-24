package test;



class Task1 extends Thread{
	
	@Override
	public void run() {
		System.out.println("running run()");
	}
}
public class Program1 {
	
	public static void main1(String[] args) {
		
		Thread th = new Task1();
		th.start();
	}

	public static void main(String[] args) {
		
		Thread th = Thread.currentThread();
		
		System.out.println(th);
		
		System.out.println("Thread Name : "+th.getName());
		System.out.println("Thread state : "+th.getState());
		System.out.println("Thread priority : "+th.getPriority());
		
		boolean status = th.isAlive();
		System.out.println("Thread status : "+( status ? "Alive" : "Dead" ));
		
		boolean type = th.isDaemon();
		System.out.println("Thread Type : "+(type ? "Daemon Thread":"User Thread"));
		
		ThreadGroup group = th.getThreadGroup(); 
		System.out.println("Thread Name : "+group.getName());
	}
	
	
}
