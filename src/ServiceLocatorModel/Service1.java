package ServiceLocatorModel;

public class Service1 implements Service {

	@Override
	public void execute() {
		System.out.println("execute service1");

	}

	@Override
	public String getServerName() {
		return "service1";
	}

}
