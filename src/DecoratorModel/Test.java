package DecoratorModel;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Circle circle = new Circle();
		circle.draw();
		HalfCircle halfCircle = new HalfCircle(new Circle());
		halfCircle.draw();
	}

}
