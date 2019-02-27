package CarPartnerDemo;

public class Mediator extends AbstractMediator {
	
	/**
	 * 子类初始化交互对象并实现交互方法
	 */
	public Mediator(AbstractCarPartner a,AbstractCarPartner b) {
		this.partnerA = a;
		this.partnerB = b;
	}

	public void Awin(double money) {
		partnerA.setMoney(partnerA.getMoney()+money);
		partnerB.setMoney(partnerB.getMoney()-money);
		System.out.println("中介计算后，A赢了"+money+",还剩"+partnerA.getMoney()+",B输了,还剩"+partnerB.getMoney());
	}
	
	public void Bwin(double money) {
		partnerA.setMoney(partnerA.getMoney()-money);
		partnerB.setMoney(partnerB.getMoney()+money);
		System.out.println("中介计算后，B赢了"+money+",还剩"+partnerB.getMoney()+",A输了,还剩"+partnerA.getMoney());
	}
}
