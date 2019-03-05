package StrategyModel;


/*
 * 策略模式：在主类运行过程中，通过传入的不同策略来改变主类执行的算法或行为
 * 
 * 不同于状态模式，状态模式中的状态本身就是属于主类的一部分，因此状态的改变的同时主类也在改变
 * 而策略模式是根据传入的策略作出相应的行动，外部传入
 */
public interface Strategy {
	public int execute(int a,int b);
}
