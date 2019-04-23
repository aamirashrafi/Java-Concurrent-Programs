package Daemon_Thread;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.util.Deque;
public class WriterTask implements Runnable {

	private Deque<Event> deque;
	
	public WriterTask(Deque<Event> deque) {
		this.deque=deque;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Write 100 Events
		for (int i = 0; i < 100; i++) {
			Event event=new Event();
			event.setDate(new Date());
			event.setEvent(String.format("The thread %s has generated the event %d event",Thread.currentThread().getName(),i));
			deque.addFirst(event);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
