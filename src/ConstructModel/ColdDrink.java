package ConstructModel;

/*
 * 冷饮类，可分为百事可乐和可口可乐
 */
public abstract class ColdDrink implements Item {

	//包装方式为瓶装
	@Override
	public Pack pack() {
		return new Bottle();
	}

	@Override
	public abstract double price();

}
