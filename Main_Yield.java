package MyPckg;

public class Main_Yield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadYeildA A=new ThreadYeildA();
		ThreadYieldB B=new ThreadYieldB();
		A.start();
		B.start();
	}

}
class ThreadYeildA extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			if (i==2) yield();
			System.out.println("Thread A : "+i);
		}
		System.out.println("Exit From Thread A ");
	}
	
	
}

class ThreadYieldB extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread B : "+i);
		}
		System.out.println("Exit from Thread B");
	}
	
	
}