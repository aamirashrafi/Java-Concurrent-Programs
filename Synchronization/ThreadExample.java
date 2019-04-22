package Sychronization;
import java.util.Scanner;

class Account{
	
	private int balance;
	public Account(int balance) {
		this.balance=balance;
	}
	
	public boolean isSufficient(int w) {
		if(balance>w)
			return(true);
		else
			return(false);
	}
	
	public void withdraw(int amt) {
		balance=balance-amt;
		System.out.println("Withdraw money is : "+amt);
		System.out.println("Remaining balance is : "+balance);
	} 

}

class Customer implements Runnable{
	private String name;
	private Account account;
	public Customer(Account account, String name) {
		this.account=account;
		this.name=name;

	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized (account) {
			System.out.println(name+", Enter amount to withdraw");
			Scanner kb=new Scanner(System.in);
			int amt=kb.nextInt();
			if(account.isSufficient(amt)) {
				System.out.println(name);
				account.withdraw(amt);
			}else
				System.out.println("Insufficient Balance !");
			}
		}
	
}
public class ThreadExample {
	public static void main(String[] args) {
		Account a1=new Account(1000);
		Customer c1=new Customer(a1, "Aamir"), c2=new Customer(a1, "Ali");
		Thread t1=new Thread(c1);
		Thread t2=new Thread(c2);
		t1.start();
		t2.start();
	}
}
