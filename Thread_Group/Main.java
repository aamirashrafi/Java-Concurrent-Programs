package Thread_Group;
import Thread_Group.Task;
import Thread_Group.MyThreadGroup;

public class Main {
	public static void main(String[] args) {
		int numberOfThreads = 2*Runtime.getRuntime().availableProcessors();
		
		MyThreadGroup threadGroup = new MyThreadGroup("My ThreadGroup");
			
		Task task=new Task();
		
		for (int i = 0; i < numberOfThreads; i++) {
			Thread t = new Thread(threadGroup, task);
			t.start();
		}
		System.out.printf("Number of threads : %d\n",threadGroup.activeCount());
		System.out.printf("Information about the thread group\n");
		threadGroup.list();
	}
}
