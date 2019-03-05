package CompositeModel;

public class Test {

	public static void main(String[] args) {
		Client client = new Client();
		
		client.setData("张三", "李四");
		client.printData();
		
		client.setData("王五", "赵六");
		client.printData();
	}

}
