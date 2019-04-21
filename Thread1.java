package MyPckg;

public class Thread1 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			try {
				if(i==2) sleep(5000);
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("Thread 1 Lppo "+i);
		}
		System.out.println("Exit from Thread 1");
	}
	

}
