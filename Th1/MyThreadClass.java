package Th1;

public class MyThreadClass extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread name is : "+Thread.currentThread().getName()+" and id is :"+Thread.currentThread().getId()+" and priority is : "+Thread.currentThread().getPriority());
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
