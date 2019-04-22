package Sleeping_Resuming_Thread;
import Sleeping_Resuming_Thread.ConsoleClock;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		ConsoleClock clock=new ConsoleClock();
		Thread thread=new Thread(clock);
		thread.start();
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		thread.interrupt(); 
	}

}
