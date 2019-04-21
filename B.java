package MyPckg;

public class B extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("From Thread B "+i);
		}
		System.out.println("Exit from Thread B");
	}
}

