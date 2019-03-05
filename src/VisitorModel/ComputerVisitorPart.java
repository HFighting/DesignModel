package VisitorModel;

public class ComputerVisitorPart implements ComputerVisitor {

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("访问者模式：访问键盘");

	}

	@Override
	public void visit(Mouse mouse) {
		// TODO Auto-generated method stub
		System.out.println("访问者模式：访问鼠标");
	}

	@Override
	public void visit(Monitor monitor) {
		// TODO Auto-generated method stub
		System.out.println("访问者模式：访问显示器");
	}

}
