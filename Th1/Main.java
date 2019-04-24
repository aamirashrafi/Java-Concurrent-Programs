package Th1;

public class Main {
	public static void main(String[] args) {
		MyThreadClass thread1 = new MyThreadClass();
		MyThreadClass thread2 = new MyThreadClass();
		thread1.start();
		thread2.start();
	}
}
