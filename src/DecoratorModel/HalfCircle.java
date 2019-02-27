package DecoratorModel;

public class HalfCircle extends DecoratorCircle {
	
	public HalfCircle(Shap shap) {
		super(shap);
	}
	
	public void draw() {
		decoratorshap.draw();
		//添加新功能
		setHalf();
	}
	public void setHalf() {
		System.out.println("设置半圆");
	}
}
