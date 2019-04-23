package UncontrolledExceptions;

import UncontrolledExceptions.ExceptionHandler;
import UncontrolledExceptions.Task;

public class Main {
public static void main(String[] args) {
	Task task=new Task();
	Thread thread=new Thread(task);
	thread.setUncaughtExceptionHandler(new ExceptionHandler());
	thread.start();
	try {
		thread.join();
	} catch (InterruptedException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
