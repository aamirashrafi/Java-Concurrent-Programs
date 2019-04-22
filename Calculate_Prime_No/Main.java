//**************** Main.java*******************\\
/*
*  @Author	: 	Muhammad Aamir Ali
*  github 	: 	https://github.com/aamirashrafi
*  Linkedin	:	https://www.linkedin.com/in/maamirali/
*  ****************************************************\\
*  
*/

package Section1;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Thread.State;
import java.util.concurrent.ThreadLocalRandom;;
public class Main {

	public static void main(String[] args) {
		// Checking Default Priority of Thread
		System.out.printf("Minimum Priority : %s\n",Thread.MIN_PRIORITY);
		System.out.printf("Normal Priority :  %s\n",Thread.NORM_PRIORITY);
		System.out.printf("Maximum Priority : %s\n",Thread.MAX_PRIORITY);
		
		Thread threads[];
		Thread.State status[];
		//Launch 10 threads to do the operation, 5 with the max
		// priority, 5 with the min 
		threads = new Thread[10];
		status	= new Thread.State[10];
		for (int i = 0; i < 10 ; i++) {
			threads[i] = new Thread(new Calculator());
			if ((i%2)==0) {
				threads[i].setPriority(Thread.MAX_PRIORITY);
			}else {
				threads[i].setPriority(Thread.MIN_PRIORITY);
			}
			threads[i].setName("My Thread "+i);
		}
		try(FileWriter file = new FileWriter("C:\\Users\\maami\\Concurrent-Java-Project\\src\\Section1\\log.txt"); PrintWriter pw = new PrintWriter(file) ){
			//Write the status of the thread
			for (int i = 0; i < 10; i++) {
				pw.println("Main : Status of thread "+i+" : " + threads[i].getState());
			}
			for (int i = 0; i < 10; i++) {
				threads[i].start();
			}
			boolean finish=false;
			while (!finish) {
				for (int i  = 0; i < 10; i++) {
					if (threads[i].getState()==status[i]) {
						writeThreadInfo(pw, threads[i], status[i]);
						status[i]=threads[i].getState();
						
					}
				}
				finish=true;
				for (int i = 0; i < 10; i++) {
					finish =finish && (threads[i].getState()==State.TERMINATED);
				}
				
			}
			
			
			//for (int i = 0; i < 10; i++) {
				//threads[i].start();
			//}	
		}catch (Exception e) {
			// TODO: handle exception
		}

	}
	private static void writeThreadInfo(PrintWriter pw, Thread thread, State state) {
		pw.printf("Main : Id %d - %s \n",thread.getId(),thread.getName());
		pw.printf("Main : Priority %d\n", thread.getPriority());
		pw.printf("Main : Old State %s\n", state);
		pw.printf("Main : New State %s\n", thread.getState());
	}

}
