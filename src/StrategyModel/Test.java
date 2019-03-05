package StrategyModel;

public class Test {

	public static void main(String[] args) {
		//在运行过程中，动态地传入相应地策略
		Context context = new Context(new AddStrategy());
		context.executeStrategy(2, 3);
		
		context = new Context(new SubStrategy());
		context.executeStrategy(5, 2);
	}

}
