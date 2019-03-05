package MVCModel;
/*
 * MVC模式：
 * 			model--专注于目标属性
 * 			view--专注于功能
 * 			controller--专注于使用view处理model
 */
//模型类，专注于抽象属性
public class Student {
	private String name;
	private int scade;
	/**
	 * @param name
	 * @param scade
	 */
	public Student(String name, int scade) {
		this.name = name;
		this.scade = scade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScade() {
		return scade;
	}
	public void setScade(int scade) {
		this.scade = scade;
	}
	
}
