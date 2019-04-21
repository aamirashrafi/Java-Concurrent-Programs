package MyPckg;

public class RenameAndSetPriority {
static{
	Thread t=Thread.currentThread();
	System.out.println("Name of Thread static block = "+t.getName());
	System.out.println(t);
	
}
public static void main(String[] args) {
	Thread t=Thread.currentThread();
	System.out.println("Name of thread in main = "+t.getName());
	System.out.println(t.getPriority());
	t.setName("RenameTh");
	t.setPriority(7);
	try {
		Thread.sleep(2000);
	} catch (Exception e) {
		// TODO: handle exception
	}
	System.out.println(t.getName());
	System.out.println(t.getPriority());
}
}
