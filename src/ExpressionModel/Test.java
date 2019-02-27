package ExpressionModel;

public class Test {
	
	//李强和张三是男性
	public static Expression isMale() {
		Expression exp1 = new TerminalExpression("李强");
		Expression exp2 = new TerminalExpression("张三");
		return new OrExpression(exp1, exp2);
	}
	//赵四和王五已经结婚了
	public static Expression isMarry() {
		Expression exp1 = new TerminalExpression("赵四");
		Expression exp2 = new TerminalExpression("王五");
		return new AndExpression(exp1, exp2);
	}
	public static void main(String[] args) {
		System.out.println("赵四结婚了：");
		System.out.println(isMarry().interpret("赵四"));
		System.out.println();
		System.out.println("赵四是男性：");
		System.out.println(isMale().interpret("赵四"));
		System.out.println();
		System.out.println("李强是男性：");
		System.out.println(isMale().interpret("李强"));
	}

}
