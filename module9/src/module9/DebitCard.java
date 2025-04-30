package module9;

public class DebitCard extends BankCard {
	
	private int pin;

	public DebitCard(double amt, String name, int pin) {
		super(name, amt);
		this.pin = pin;
	}
	
	public void deposit(int pass, double amt) {
		if (pin != pass) {
			System.out.println("Cannot deposit incorrect password");
		}
		else {
			super.deposit(amt);
		}
	}
	
	public void withdraw(int pass, double amt) {
		if (pin != pass) {
			System.out.println("Cannot withdraw incorrect pin");
		}
		else {
			System.out.println("Spending $"+amt);
			if (super.getAmount()<amt) {
				System.out.println("The amount you want to spend is too much lower the cost");
			}
			else {
				super.withdraw(amt);
			}
		}
	}
	
	@Override
	public String cardInfo() {
		return "Belongs to "+super.getOwner()+", current amount in account: $"+super.getAmount();
	}

}
