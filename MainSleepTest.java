package MyPckg;

public class MainSleepTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1_obj	=	new Thread1();
		Thread2 T2_obj	=	new Thread2();
		t1_obj.start();
		T2_obj.start();

	}

}
