package MementoModel;

import java.util.ArrayList;

/*
 * 该类用来保存所有状态类
 */
public class SaveList {
	//该链表用来保存所有的需要保存的状态
	private ArrayList<StateMemento> stateLists = new ArrayList<>();

	//向其中添加状态
	public void add(StateMemento memento) {
		stateLists.add(memento);
	}
	
	//得到相应的状态
	public StateMemento getStateIndex(int index) {
		return stateLists.get(index);
	}
	
}
