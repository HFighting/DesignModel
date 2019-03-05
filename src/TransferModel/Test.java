package TransferModel;

public class Test {

	public static void main(String[] args) {
		Student student1 = new Student(1, "张三"); 
		Student student2 = new Student(2, "李四");
		
		StudentOpera data = new StudentOpera();
		data.add(student1);
		data.add(student2);
		
		for (Student stu : data.getAll()) {
			System.out.println(stu.getNumber()+":"+stu.getName());
		}
		System.out.println("更改数据：李四-->王五");
		Student student3 = new Student(2, "王五");
		data.updateData(student3);
		
		for (Student stu : data.getAll()) {
			System.out.println(stu.getNumber()+":"+stu.getName());
		}
		
	}

}
