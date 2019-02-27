package DecoratorModel;

public class Circle implements Shap {
	
	@Override
	public void draw() {
		System.out.println("画一个⚪");
	}
	//接下来为该圆添加新功能，比如折叠起来成半圆
}
