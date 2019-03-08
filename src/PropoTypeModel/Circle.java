package PropoTypeModel;

public class Circle extends Shap{

	public Circle(String type) {
		this.type = type;
	}

	@Override
	void draw() {
		System.out.println("this is circle!");
	}

}
