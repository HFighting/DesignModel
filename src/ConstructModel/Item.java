package ConstructModel;
/*
 * 构造者模式：
 * 
 * 利用多个简单对象建造一个复杂对象
 * 
 * 例如在肯德基里：汉堡，鸡肉，饮料可以包含多种类型，可以组合多种套餐
 * 利用多种组合构造一个套餐
 */

//创建一个表示食物条目的接口
public interface Item {	
	public String name();
	public Pack pack();
	public double price();
}
