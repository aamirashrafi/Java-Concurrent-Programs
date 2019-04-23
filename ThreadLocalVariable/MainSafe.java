package ThreadLocalVariable;
import java.util.concurrent.TimeUnit;
import ThreadLocalVariable.safeTask;
public class MainSafe {

	public static void main(String[] args) {
		safeTask task=new safeTask();
		for (int i = 0; i < 2* Runtime.getRuntime().availableProcessors(); i++) {
			Thread thread=new Thread(task);
			
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}	
			thread.start();
		}
	}
}
