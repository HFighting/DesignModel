package FrontControllerModel;

public class Test {

	public static void main(String[] args) {
		ControllerObject controller = new ControllerObject();
		controller.dealRequest("lastpage");
		
		controller.dealRequest("firstpage");
		
		controller.dealRequest("otherrequest");
		
	}

}
