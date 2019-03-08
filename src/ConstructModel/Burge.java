package ConstructModel;

/*
 * 创建一个抽象类实现食物条目接口，食物条目分为汉堡和饮料
 * 汉堡类抽象类，其下可分为素食汉堡和鸡肉汉堡
 */
public abstract class Burge implements Item {
	
	//食物包装,默认为纸质包装
	@Override
	public Pack pack() {
		return new Wrapper();
	}
	//食物价格
	@Override
	public abstract double price();

}
