package ObserverModel;

public class HexObserver extends Observer {

	/**
	 * 
	 */
	public HexObserver(Subject subject) {
		super();
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("十六进制观察者的状态："+Integer.toHexString(subject.getState()));
	}
	
}
