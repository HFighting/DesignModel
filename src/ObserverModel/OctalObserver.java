package ObserverModel;

public class OctalObserver extends Observer {

	/**
	 * 
	 */
	public OctalObserver(Subject subject) {
		super();
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("八进制观察者的状态："+Integer.toOctalString(subject.getState()));
	}

}
