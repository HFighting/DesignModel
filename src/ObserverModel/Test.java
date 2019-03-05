package ObserverModel;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new Subject();
		subject.setState(10);
		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexObserver(subject);

		subject.setState(15);

		subject.setState(20);

	}

}
