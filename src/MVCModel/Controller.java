package MVCModel;


//控制器类：专注于使用view处理model类，包含这两个参数，调用view中的方法处理model
public class Controller {
	private Student student;
	private StudentView view;
	/**
	 * @param student
	 * @param view
	 */
	public Controller(Student student, StudentView view) {
		this.student = student;
		this.view = view;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public StudentView getView() {
		return view;
	}
	public void setView(StudentView view) {
		this.view = view;
	}
	//调用view中的方法处理model，所以在view中不需要显示传入model类
	public void ControllerDeal() {
		view.printView(student.getName(), student.getScade());
	}
}
