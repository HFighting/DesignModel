package StateModel;

public class StartState implements State {
	
	@Override
	public void doAction(Context context) {
		//该方法重新设置主类的状态
		System.out.println("状态改变：开始状态");
		context.setState(this);
	}
	public String toString() {
		return "开启状态";
	}
}
