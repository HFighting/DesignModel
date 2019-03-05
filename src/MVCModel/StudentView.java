package MVCModel;

//视图类：专注于功能的实现，不需要显示传入模型对象
public class StudentView {
	public void printView(String name,int scade) {
		System.out.println("Student");
		System.out.println("name:"+name);
		System.out.println("scade:"+scade);
	}
}
