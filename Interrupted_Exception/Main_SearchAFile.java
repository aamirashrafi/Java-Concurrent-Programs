package Interrupted_Exception;
import  java.util.concurrent.TimeUnit;
import  Interrupted_Exception.FileSearch;
public class Main_SearchAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSearch searcher=new FileSearch("C:\\Users\\maami\\Concurrent-Java-Project\\src\\Interrupted_Exception", "FileSearch.java");
		Thread thread=new Thread(searcher);
		thread.start();
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		thread.interrupt();
	}

}
