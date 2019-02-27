package CarPartnerDemo;

/*
 * 抽象中介类
 * 主要计算牌友之间的Money交换
 * 其内部应该包含相互交互的几个对象，同时包含交互的方法，交互方法应该交给子类实现
 */

public abstract class AbstractMediator {
	AbstractCarPartner partnerA = null;
	AbstractCarPartner partnerB = null;
	
	public abstract void Awin(double money);
	
	public abstract void Bwin(double money);
	
}
