package ServiceLocatorModel;

public class Test {

	public static void main(String[] args) {
		ServiceLocator locator = new ServiceLocator();
		Service service = locator.getService("serVice1");
		service.execute();
		
		Service service2 = locator.getService("servicE2");
		service2.execute();
		
		Service service3 = locator.getService("service2");
		service3.execute();

	}

}
