package VisitorModel;

public interface ComputerVisitor {
	
	//访问者对象需要定义对访问对象执行的具体方法
	public void visit(Keyboard keyboard);
	public void visit(Mouse mouse);
	public void visit(Monitor monitor);
	
}
