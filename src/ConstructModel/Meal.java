package ConstructModel;
/*
 * 套餐类，可以加入多种食物和饮料组成套餐
 * 
 * 包含一个Item集合类
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> foods = new ArrayList<>();

	//添加食物
	public void addItem(Item item) {
		foods.add(item);
	}
	//计算价格
	public double calprice() {
		double tolprice = 0;
		for (Item item : foods) {
			tolprice += item.price();
		}
		return tolprice;
	}
	//显示套餐内的所有食物
	public void showAll() {
		for (Item item : foods) {
			System.out.println("name:"+item.name()+"   价格:"+item.price());
		}
	}
}
