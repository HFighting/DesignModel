package VisitorModel;

public class Mouse implements ComputerPart {

	@Override
	public void accept(ComputerVisitor computerVisitor) {
		computerVisitor.visit(this);
	}

}
