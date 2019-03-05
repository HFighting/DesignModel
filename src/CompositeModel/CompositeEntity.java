package CompositeModel;
/*
 * 组合实体模式
 * 组合 组合类 的类，同时也提供了改变数据的方法，数据一旦改变，则由此以下的数据都会变
 */
public class CompositeEntity {
	private CoreseEntity coreseEntity = new CoreseEntity();
	
	public void setData(String data1,String data2) {
		coreseEntity.setData(data1, data2);
	}
	
	public String[] getData() {
		return coreseEntity.getData();
	}
	
}
