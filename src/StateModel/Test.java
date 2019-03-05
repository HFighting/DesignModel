package StateModel;

public class Test {

	public static void main(String[] args) {
		Context context = new Context();//初始化主类，其中的状态是null
		StartState startState = new StartState();//新建状态类
		startState.doAction(context);//改变状态，并注入到主类中
		System.out.println(context.getState());//通过主类得到此时的状态
		
		EndState endState = new EndState();
		endState.doAction(context);
		System.out.println(context.getState());
	}
}
