package MyPckg;

public class A extends Thread {
public void run() {
	for (int i = 0; i < 5; i++) {
		System.out.println("From Thread A "+i);
	}
	System.out.println("Exit from Thread A");
}
}
