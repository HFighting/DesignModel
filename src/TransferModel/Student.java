package TransferModel;

/*
 * 传输对象模式：从客户端向服务器一次性传递带有多个属性的数据。传输对象是一个具有getter和setter方法的POJO类
 * 服务器端的业务类通常从数据库读取数据，然后填充 POJO，并把它发送到客户端或按值传递它。
 */
public class Student {
	private int number;
	private String name;
	/**
	 * @param number
	 * @param name
	 */
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
