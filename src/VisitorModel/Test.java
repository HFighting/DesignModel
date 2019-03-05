package VisitorModel;

public class Test {

	public static void main(String[] args) {
		
		//创建访问者类
		ComputerVisitor visitor = new ComputerVisitorPart();
		
		ComputerPart keyboard = new Keyboard();
		ComputerPart mouse = new Mouse();
		ComputerPart monitor = new Monitor();
		
		keyboard.accept(visitor);
		mouse.accept(visitor);
		monitor.accept(visitor);
	}

}
