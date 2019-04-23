package Daemon_Thread;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

import Daemon_Thread.Event;
import Daemon_Thread.CleanerTask;
import Daemon_Thread.WriterTask;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Deque<Event> deque = new ConcurrentLinkedDeque<Event>();
		WriterTask writer=new WriterTask(deque);
		
		for (int i = 0; i < Runtime.getRuntime().availableProcessors(); i++) {
			Thread thread=new Thread(writer);
			thread.start();
			
			CleanerTask cleanner=new CleanerTask(deque);
			cleanner.start();
		}
	}

}
