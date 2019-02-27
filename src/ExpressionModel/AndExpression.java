package ExpressionModel;

//在把对象组合起来成为一个解释器
public class AndExpression implements Expression {
	Expression exp1 = null;
	Expression exp2 = null;
	public AndExpression(Expression exp1, Expression exp2) {
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
	
	@Override
	public boolean interpret(String context) {
		return exp1.interpret(context)&&exp2.interpret(context);
	}
	
}
