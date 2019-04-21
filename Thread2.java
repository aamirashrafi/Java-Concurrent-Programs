package MyPckg;

public class Thread2 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			System.out.println("Thread 2 Loop "+i);
		}
		System.out.println("Exit from Thread 2");
	}

}
