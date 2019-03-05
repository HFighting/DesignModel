package CompositeModel;
/*
 * 该类组合了上面两个类，该便该对象的数据时，包含的两个对象的数据也改变
 */
public class CoreseEntity {
	private DependObject1 object1 = new DependObject1();
	private DependObject2 object2 = new DependObject2();
	
	public void setData(String data1,String data2) {
		object1.setData(data1);
		object2.setData(data2);
	}
	
	public String[] getData() {
		return new String[] {object1.getData(),object2.getData()};
	}
	
}
