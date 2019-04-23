package ThreadLocalVariable;
import java.util.concurrent.TimeUnit;
import ThreadLocalVariable.unsafeTask;
public class Main {
public static void main(String[] args) {
	unsafeTask task=new unsafeTask();
	for (int i = 0; i < 10; i++) {
		Thread thread=new Thread(task);
		thread.start();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}	

	}
	}
}
