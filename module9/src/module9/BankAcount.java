package module9;

public class BankAcount {
	
	private DebitCard debit;
	private CreditCard credit;
	private String owner;
	private int pin;
	

	public BankAcount(String name, double depo, int pin) {
		debit = new DebitCard(depo, name, pin);
		credit = new CreditCard(name);
		owner = name;
		this.pin = pin;
	}
	
	public BankAcount(String name, int pin) {
		debit = new DebitCard(0, name, pin);
		credit = new CreditCard(name);
	}
	
	public void useCredit(double amt) {
		credit.spend(amt);
	}
	
	public void payBack(double amt) {
		if (debit.getAmount() < amt) {
			System.out.println("You cant pay this amount back you do not have enough in debit");
		}
		else {
			debit.withdraw(amt);
			credit.payBack(amt);
		}
	}
	
	public void useDebit(double amt) {
		debit.withdraw(pin, amt);
	}
	
	public void depositDebit(double amt) {
		System.out.println("Depositing $"+amt);
		debit.deposit(amt);
	}
	
	public double getAmtDebit() {
		return debit.getAmount();
	}
	
	public double getAmtOwed() {
		return credit.getAmtDue();
	}
	
	public String getOwner() {
		return owner;
	}
	
	public int getPin() {
		return pin;
	}
	
	public String toString() {
		return owner+" is the owner of this account, they have $"+getAmtDebit()+" on their debit card and "+getAmtOwed()+" owed on their credit";
	}

}
