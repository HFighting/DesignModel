package DecoratorModel;

public abstract class DecoratorCircle implements Shap {
	//装饰器里有一个该类的对象
	protected Shap decoratorshap;
	
	public DecoratorCircle(Shap shap) {
		this.decoratorshap = shap;
	}

	@Override
	public void draw() {
		
		decoratorshap.draw();
	}

}
