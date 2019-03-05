package StrategyModel;

public class Context {
	private Strategy strategy;

	/**
	 * @param strategy
	 */
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	//执行相应的策略
	public void executeStrategy(int a,int b) {
		if (strategy.getClass().getSimpleName().equals("AddStrategy")) {
			System.out.println("执行加法操作："+a+"+"+b+"="+strategy.execute(a, b));
		}else {
			System.out.println("执行减法操作："+a+"-"+b+"="+strategy.execute(a, b));
		}
	}
	
}
