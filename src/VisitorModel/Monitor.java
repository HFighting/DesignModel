package VisitorModel;

public class Monitor implements ComputerPart {

	@Override
	public void accept(ComputerVisitor computerVisitor) {
		computerVisitor.visit(this);
	}

}
