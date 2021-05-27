package Threads;

public class Main {
	
	public static void  main(String []args)
	{
		new TryThreads("Thread object 1").start();
		new TryThreads("Thread object 2").start();
		new Threads(new Simple("Runnable object ")).start();
		
	}

}
