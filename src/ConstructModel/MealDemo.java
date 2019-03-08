package ConstructModel;

public class MealDemo {

	public static void main(String[] args) {
		Meal meal1 = new Meal();//套餐1
		VegBurge vegBurge = new VegBurge();
		BaishiCol baishiCol = new BaishiCol();
		meal1.addItem(vegBurge);
		meal1.addItem(baishiCol);
		System.out.println("您的点餐为：");
		meal1.showAll();
		System.out.println("您的餐费为："+meal1.calprice());
		
		Meal meal2 = new Meal();//套餐2
		CheckBurge checkburge = new CheckBurge();
		KekouCol kekoucol = new KekouCol();
		meal2.addItem(checkburge);
		meal2.addItem(kekoucol);
		System.out.println("您的点餐为：");
		meal2.showAll();
		System.out.println("您的餐费为："+meal2.calprice());
	}

}
