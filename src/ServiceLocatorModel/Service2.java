package ServiceLocatorModel;

public class Service2 implements Service {

	@Override
	public void execute() {
		System.out.println("execute service2");

	}

	@Override
	public String getServerName() {
		return "service2";
	}

}
