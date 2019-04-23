package Thread_Group;

public class MyThreadGroup extends ThreadGroup{

		
	public MyThreadGroup(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		// TODO Auto-generated method stub
			System.out.printf("The thread %s has thrown an exception \n",t.getId());
			e.printStackTrace(System.out);
			System.out.printf("Terminating the rest of the threads\n");
			interrupt();
		
	}

}
