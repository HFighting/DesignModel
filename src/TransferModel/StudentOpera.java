package TransferModel;
/*
 * 该类是用来操作POJO类的，客户端使用该类来填充POJO类，然后传输
 */

import java.util.ArrayList;
import java.util.List;

public class StudentOpera {
	private List<Student> database = new ArrayList<>();//充当数据库
	
	//添加到数据库
	public void add(Student stu) {
		//添加之前先查找是否有重复的,序号是独一无二的
		for (Student student : database) {
			if (stu.getNumber()==student.getNumber()) {
				System.out.println("已经有目标了");
				return;
			}
		}
		database.add(stu);
	}
	//从数据库中删除
	public void delet(int num) {
		for (Student student : database) {
			if (student.getNumber()==num) {
				database.remove(student);
				return;
			}
		}
		System.out.println("没有找到该生");
	}
	//更新数据库
	public void updateData(Student stu) {
		for (Student student : database) {
			if (student.getNumber()==stu.getNumber()) {
				database.remove(student);
				database.add(stu);
				return;
			}
		}		
	}
	//得到全部数据
	public List<Student> getAll(){
		return database;
	}
	
}
