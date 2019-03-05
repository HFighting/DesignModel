package StateModel;

public class EndState implements State {
	
	@Override
	public void doAction(Context context) {
		System.out.println("状态改变：关闭状态");
		context.setState(this);
	}
	public String toString() {
		return "关闭状态";
	}
}
