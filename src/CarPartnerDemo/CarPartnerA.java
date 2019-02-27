package CarPartnerDemo;

/*
 * 牌友A
 */
public class CarPartnerA extends AbstractCarPartner {

	@Override
	public void moneyChange(double money, AbstractMediator mediator) {
		System.out.println("A赢了"+money+"钱，并把钱交给中介计算");
		mediator.Awin(money);
		
	}

}
