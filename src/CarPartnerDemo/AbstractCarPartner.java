package CarPartnerDemo;

/*
 * 抽象牌友类
 * 两人在打牌，把共同特征提取出来
 * 1.Money
 * 2.MoneyChange
 * 钱的改变是一个方法，应该交给子类去实现
 */

public abstract class AbstractCarPartner {
	
	protected double money;

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	public abstract void moneyChange(double money, AbstractMediator mediator);

	
}
