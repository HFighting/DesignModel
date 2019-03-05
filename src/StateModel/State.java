package StateModel;

/*
 * 状态模式：类的行为是基于它的状态改变的
 * 
 * 主类--包含--状态类         主类的状态改变
 * 状态类--包含--主类         改变后的状态类中，重新设置主类的状态
 */
public interface State {
	public void doAction(Context context);//重新设置主类的状态
}
