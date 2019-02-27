package CarPartnerDemo;

/*
 * 牌友B
 */
public class CarPartnerB extends AbstractCarPartner {

	@Override
	public void moneyChange(double money,AbstractMediator mediator) {
		// TODO Auto-generated method stub
		System.out.println("B赢了"+money+"钱，并把钱交给中介计算");
		mediator.Bwin(money);	
	}

}
