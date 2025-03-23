package test;



class Task1 extends Thread{
	
	@Override
	public void run() {
		System.out.println("running run()");
	}
}
public class Program1 {
	
	public static void main(String[] args) {
		
		Thread th = new Task1();
		th.start();
	}

	
	
	
}
