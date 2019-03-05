package VisitorModel;

/*
 * 访问者模式:需要对一个对象结构中的对象进行其它操作，但是又不想让这些操作污染对象，
 * 			因此需要在对象结构中允许访问者对象对该类进行操作
 */
public interface ComputerPart {
	//结构对象需要暴露给访问者具体的细节，需要传入一个访问者对象
	public void accept(ComputerVisitor computerVisitor);
	
}
