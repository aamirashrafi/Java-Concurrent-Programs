package Waiting_For_End_Of_Thread;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class NetworkConectionLoader implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.printf("Network Begining of Data source loading %s \n",new Date());	
	//sleeping for 4 seconds
	try {
		TimeUnit.SECONDS.sleep(6);
	} catch (InterruptedException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	//
	System.out.printf("Network Data source loading has finished: %s\n",new Date());
	}
}
