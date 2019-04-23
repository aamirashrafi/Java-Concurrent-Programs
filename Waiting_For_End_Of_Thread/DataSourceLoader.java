package Waiting_For_End_Of_Thread;
import java.util.Date;
import java.util.concurrent.TimeUnit;;
public class DataSourceLoader implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
			System.out.printf("Begining of Data source loading %s \n",new Date());	
			//sleeping for 4 seconds
			try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			//
			System.out.printf("Data source loading has finished: %s\n",new Date());
	}
	
}
