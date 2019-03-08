package PropoTypeModel;
/*
 * 实现cloneable接口
 */
public abstract class Shap implements Cloneable {
	
	private int id;
	protected String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}

	abstract void draw();
	
	public Object clone() {
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return object;
	}
	
	
}
