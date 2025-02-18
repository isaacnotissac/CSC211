package module2Assignment;
import java.util.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Bank {
	private double balance;
	private ArrayList<Double> bankRecord = new ArrayList<Double>();
	private DecimalFormat df = new DecimalFormat("#.##");
	
	
	public Bank(double initialBalance) {
		balance = initialBalance;
		bankRecord = this.bankRecord;
		df.setRoundingMode(RoundingMode.CEILING);
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		bankRecord.add(-amount);	
	}
	
	public void deposit(double amount) {
		balance += amount;
		bankRecord.add(amount);
	}
	
	public void listInteractions() {
		//System.out.println(bankRecord.toString());
		for (int n=0; n < bankRecord.size(); n++) {
			double amount = bankRecord.get(n);
			if (amount < 0) {
				System.out.println("You withdrawed $"+df.format(amount)+" from your balance");
			}
			else {
				System.out.println("You deposited $"+df.format(amount)+" to your balance");
			}
		}
	}
	
	public void viewBalance() {
		System.out.println("$"+df.format(balance));
	}
	
	public String toString() {
		return "Your balance is $"+df.format(balance);
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		Bank account = new Bank(1000.0);
//		DecimalFormat df = new DecimalFormat("#.##");
//		df.setRoundingMode(RoundingMode.CEILING);
		
		System.out.println("Enter the number of loops");
		int loops = input.nextInt();
		
		for (int i=0; i<loops; i++) {
			account.withdraw(random.nextDouble(0, 1000+1));
			account.deposit(random.nextDouble(0, 1000+1));
		}
		account.listInteractions();
		account.viewBalance();
		System.out.println(account.toString());
		
		
		
		
//		account.viewBalance();
//		account.withdraw(100.0);
//		account.viewBalance();
//		account.viewRecord();
//		account.deposit(239.87);
//		account.viewBalance();
//		account.viewRecord();
//		account.viewBalance();
		
	}

}
