package StrategyModel;

public class SubStrategy implements Strategy {

	@Override
	public int execute(int a, int b) {
		
		return a-b;
	}

}
