package module9;

public class Main {

	public static void main(String args[]) {
		BankCard debit = new DebitCard(1000, "John", 1121);
		BankCard credit = new CreditCard("Steven"); 
		GiftCard gift = new GiftCard("David", 100, "Alex");
		BankAcount bankA = new BankAcount("Isaac", 500, 1442);
		System.out.println(debit.cardInfo());
		System.out.println(credit.cardInfo());
		System.out.println();
		System.out.println();

		
		System.out.println(gift.cardInfo());
		gift.spend(55.2);
		System.out.println(gift.cardInfo());
		System.out.println();
		System.out.println();
		
		
		System.out.println(bankA.toString());
		bankA.useCredit(1002.3);
		System.out.println();
		
		System.out.println(bankA.toString());
		bankA.payBack(1000);
		System.out.println();
		
		System.out.println(bankA.toString());
		bankA.depositDebit(699);
		System.out.println();
		
		System.out.println(bankA.toString());
		bankA.payBack(10003);
		System.out.println();
		
		System.out.println(bankA.toString());
		bankA.useDebit(300);
		System.out.println();
		
		System.out.println(bankA.toString());






	}

}
