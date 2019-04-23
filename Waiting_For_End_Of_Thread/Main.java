package Waiting_For_End_Of_Thread;
import java.util.Date;
import Waiting_For_End_Of_Thread.DataSourceLoader;
import Waiting_For_End_Of_Thread.NetworkConectionLoader;
public class Main {
	public static void main(String[] args) {
		DataSourceLoader dsLoader=new DataSourceLoader();
		Thread thread1=new Thread(dsLoader);
		
		NetworkConectionLoader ncLoader=new NetworkConectionLoader();
		Thread thread2=new Thread(ncLoader);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.printf("Main :  Configuraton has been loaded %s\n",new Date());
	}
}
