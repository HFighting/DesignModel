package ObserverModel;

public class BinaryObserver extends Observer {

	/**
	 * 
	 */
	public BinaryObserver(Subject subject) {
		super();
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("二进制观察者的状态："+Integer.toBinaryString(subject.getState()));
	}

}
