package PropoTypeModel;

public class Rectangle extends Shap {

	public Rectangle(String type) {
		this.type = type;
	}

	@Override
	void draw() {
		System.out.println("this is a rectangle!");
	}

}
