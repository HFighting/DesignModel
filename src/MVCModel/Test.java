package MVCModel;

public class Test {

	public static void main(String[] args) {
		Student student = new Student("张三", 98);
		StudentView view = new StudentView();
		Controller controller = new Controller(student, view);
		controller.ControllerDeal();
		
		
		Student student2 = new Student("李四", 26);
		controller.setStudent(student2);
		controller.ControllerDeal();
	}

}
