package CompositeModel;
/*
 * 客户端实体类
 */
public class Client {
	private CompositeEntity compositeEntity = new CompositeEntity();
	
	public void setData(String data1,String data2) {
		compositeEntity.setData(data1, data2);
	}
	
	public void printData() {
		for (int i = 0; i < compositeEntity.getData().length; i++) {
			System.out.println("data:"+compositeEntity.getData()[i]);
		}
		
	}
}
