package module9;

public class GiftCard extends Card{
	
	private String name;
	private double amount;
	private String recipient;

	public GiftCard(String name, double amt, String reci) {
		this.name = name;
		recipient = reci;
		amount = amt;
	}
	
	public String cardInfo() {
		return "This card is for "+recipient+" for $"+amount+ " and was given by "+name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getReci() {
		return recipient;
	}
	
	public double getAmt() {
		return amount;
	}
	
	public void spend(double amt) {
		System.out.println("Spending $"+amt);
		if (amount<amt) {
			System.out.println("The amount you want to spend is too much lower the cost");
		}
		else {
			amount-=amt;
		}
	}

}
