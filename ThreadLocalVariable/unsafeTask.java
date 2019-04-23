package ThreadLocalVariable;

import java.util.concurrent.TimeUnit;
import java.util.Date;

public class unsafeTask implements Runnable {
	private Date startDate;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		startDate =new Date();
		System.out.printf("Starting Thread : %s : %s \n",Thread.currentThread().getId(),startDate);
		try {
			TimeUnit.SECONDS.sleep( (int) Math.rint(Math.random() * 10));
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.printf("Thread Finished: %s : %s \n",Thread.currentThread().getId(),startDate);
	}
	
	
}
