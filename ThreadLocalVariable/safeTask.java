package ThreadLocalVariable;

import java.util.concurrent.TimeUnit;
import java.util.Date;

public class safeTask implements Runnable {

	private static ThreadLocal<Date> startDate=new ThreadLocal<Date>() {

		protected Date initialValue() {
			return new Date();
		}	
		
	};
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.printf("Starting Thread : %s : %s \n",Thread.currentThread().getId(),startDate.get());
		try {
			TimeUnit.SECONDS.sleep( (int) Math.rint(Math.random() * 10));
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.printf("Thread Finished: %s : %s \n",Thread.currentThread().getId(),startDate.get());
	}
	
	
}
