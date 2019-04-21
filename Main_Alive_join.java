
public class Main_Alive_join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1=new Thread1();
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("NewStatus : "+t1.isAlive());
	}

}
class Thread1 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("Status : "+isAlive());
		}
		System.out.println("Exit from thread 1");
	}
	
	
}
