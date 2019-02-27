package ExpressionModel;

public class TerminalExpression implements Expression {
	//把特定的词包装成一个对象
	private String data;
	
	public TerminalExpression(String data) {
		this.data = data;
	}
	//该对象是否包含特定语言部分
	@Override
	public boolean interpret(String context) {
		if (data.contains(context)) {
			return true;
		}
		return false;
	}

}
