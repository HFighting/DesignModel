package ObserverModel;

import java.util.ArrayList;
import java.util.List;

/*
 * 观察者模式：一个目标对象与多个对象有关联，当目标对象发生改变时，需要通知多个关联对象进行更新
 * 这些多个关联对象就是观察者
 * 
 * 目标对象中应该包含这多个对象的集合，当目标对象发生改变，则通知每个对象更新
 */

public class Subject {
	
	private int state;

	private List<Observer> observers = new ArrayList<>();
	/**
	 * 
	 */
	public Subject() {
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllServer();
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	@SuppressWarnings("unused")
	private void notifyAllServer() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
