 package Sleeping_Resuming_Thread;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ConsoleClock implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++){
			System.out.printf("%s\n",new Date());
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.printf("The file clock has been interrupted. \n");
			}
		}
	}
	
}
