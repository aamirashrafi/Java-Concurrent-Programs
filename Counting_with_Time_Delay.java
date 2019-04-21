package MyPckg;

public class Counting_with_Time_Delay {
	public static void main(String[] args) {
		ThreadA t=new ThreadA();
		t.start();
		ThreadA t1=new ThreadA();
		t1.start();
	}

}
class ThreadA extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(i);
		}
	}	
}
