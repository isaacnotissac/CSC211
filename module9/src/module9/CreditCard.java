package module9;

public class CreditCard extends BankCard{
	private double amtDued=0;

	public CreditCard(String name) {
		super(name);
	}
	
	public double getAmtDue() {
		return amtDued;
	}
	
	public void spend(double amt) {
		System.out.println("Spending $"+amt+" on credit");
		amtDued+= amt;
		
	}
	public void payBack(double amt) {
		System.out.println("Paying back $"+amt);
		amtDued-=amt;
	}

}
