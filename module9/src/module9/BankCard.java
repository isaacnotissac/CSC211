package module9;

public class BankCard extends Card{
	
	private String name;
	private double amount;

	public BankCard(String name, double depo) {
		this.name = name;
		amount +=depo;
	}
	
	public BankCard(String name) {
		this.name = name;
	}
	
	
	@Override
	public String cardInfo() {
		return "Belongs to "+name+", current amount in account: $"+amount;
	}
	
	public void deposit(double amt) {
		amount += amt;
	}
	
	public void withdraw(double amt) {
		amount -= amt;
	}
	
	public double getAmount() {
		return amount;
	}
	public String getOwner() {
		return name;
	}

}
