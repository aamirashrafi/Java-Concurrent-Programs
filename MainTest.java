package MyPckg;

public class MainTest {
	public static void main(String[] args) {
		Test objTest	=	new Test();
		Thread obj	=	new Thread(objTest);
		obj.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}
	}

}
