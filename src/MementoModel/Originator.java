package MementoModel;

/*
 * 原始状态对象
 */
public class Originator {
	
	private String state;//状态

	/**
	 * @param state
	 */
	public Originator(String state) {
		this.state = state;
	}
	
	//设置状态
	public void setState(String state) {
		this.state = state;
	}
	
	//得到此时的状态
	public String getState() {
		return state;
	}
	
	//保存状态对象到状态类中
	public StateMemento saveStateToMemento() {
		return new StateMemento(state);
	}
	
	//从状态类中得到先前的状态，（状态类保存在哪儿，需要传入对应的对象才能得到状态）
	public void getStateFromMemento(StateMemento state) {
		this.state = state.getState();		
	}
	
}
