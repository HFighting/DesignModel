package ExpressionModel;
/*
 * 解释器模式：给定一个语言，定义它的文法表达式，用它来解释语言中的句子
 * 先定义一个接口，该接口解释特定的上下文
 * 把各部分都封装成一个对象，在另一个类中把这些对象组合成一个特定的解释器，在用这些解释器去解释语言
 */
public interface Expression {
	public boolean interpret(String context);//解释器接口，用来解释特定上下文
}
