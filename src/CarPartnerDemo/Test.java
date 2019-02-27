package CarPartnerDemo;

public class Test {

	public static void main(String[] args) {
		AbstractCarPartner partnerA = new CarPartnerA();
		partnerA.setMoney(20);
		
	    AbstractCarPartner partnerB = new CarPartnerB();
		partnerB.setMoney(30);
		//中介类
		Mediator mediator = new Mediator(partnerA,partnerB);
		
		partnerA.moneyChange(5, mediator);
		
	}

}
