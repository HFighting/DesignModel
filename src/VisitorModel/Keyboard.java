package VisitorModel;

public class Keyboard implements ComputerPart {

	@Override
	public void accept(ComputerVisitor computerVisitor) {
		computerVisitor.visit(this);
	}
	
}
