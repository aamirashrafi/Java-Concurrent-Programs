package ProducerConsumer;

import java.util.List;
import java.util.ArrayList;

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		List<Integer> sharedList = new ArrayList<Integer>();
		Thread producer=new Thread(new Producer(sharedList));
		Thread consumer=new Thread(new Consumer(sharedList));
		producer.start();
		consumer.start();
	}
}

class Producer implements Runnable{
	List<Integer> sharedList = null;
	final int MAX_SIZE = 5;
	private int i=0;
	public Producer(List<Integer> sharedList) {
		super();
		this.sharedList = sharedList;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				produce(i++);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	public void produce(int i) throws InterruptedException {
		synchronized (sharedList) {
			while(sharedList.size()==MAX_SIZE) {
				System.out.println("shared list is full....waiting for the consumer to consume...");
				sharedList.wait();
			}
			
		}
		synchronized (sharedList) {
			System.out.println("Produce produced the element "+i);
			sharedList.add(i);
			Thread.sleep(1000);
			sharedList.notify();
			
		}
	}
}





class Consumer implements Runnable{
	List<Integer> sharedList = null;
	
	public Consumer(List<Integer> sharedList) {
		super();
		this.sharedList = sharedList;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				consume();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	public void consume() throws InterruptedException {
		synchronized (sharedList) {
			while(sharedList.isEmpty()) {
				System.out.println("shared list is empty....waiting for the producer to produce the object...");
				sharedList.wait();
			}
			
		}
		synchronized (sharedList) {
			Thread.sleep(1000);
			System.out.println("Consume the element"+sharedList.remove(0));
			sharedList.notify();
			
		}
	}
}

