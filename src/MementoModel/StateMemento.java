package MementoModel;
/*
 * 备忘录模式：保存对象的某一个（或某些）状态，以便在适当的时候恢复该状态
 * 例如：网页返回键，word撤销等
 * 条件：抽象出一个状态类
 * 		保存地方，可能是一个集合，可能是一个类，可能是一个类里的集合
 * 		原始对象类
 */

/*
 * 把对象的状态抽象成一个---状态类
 */
public class StateMemento {
	private String state;//状态变量，保存状态
	
	/**
	 * @param state
	 * 初始化状态对象
	 */
	public StateMemento(String state) {
		this.state = state;
	}
	
	//得到状态
	public String getState() {
		return state;
	}
	
}
