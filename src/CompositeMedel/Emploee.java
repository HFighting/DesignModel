package CompositeMedel;

import java.util.ArrayList;
import java.util.List;
/*
 * 组合模式：按照树形结构表现出整体层次
 */
public class Emploee {
	private String name;
	private String dept;
	private double salary;
	private List<Emploee> subemploee;
	public Emploee(String name, String dept, double salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		init();
	}
	private void init() {
		subemploee = new ArrayList<Emploee>();
	}
	public void add(Emploee e) {
		subemploee.add(e);
	}
	public void delete(Emploee e) {
		subemploee.remove(e);
	}
	public List<Emploee> getEmploee(){
		return subemploee;
	}
	public String toString() {
		return "职位："+dept+",名称："+name+",薪水："+salary;
	}
}
