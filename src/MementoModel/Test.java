package MementoModel;

public class Test {

	public static void main(String[] args) {
		
		//状态保存队列
		SaveList list = new SaveList();
		
		Originator origin1 = new Originator("num1");
		origin1.setState("num2");
		//保存状态
		list.add(origin1.saveStateToMemento());
		origin1.setState("num3");
		list.add(origin1.saveStateToMemento());
		origin1.setState("num4");
		
		System.out.println("the current state is: "+origin1.getState());
		//恢复状态1
		origin1.getStateFromMemento(list.getStateIndex(0));
		System.out.println("the first state is: "+origin1.getState());
		
		//恢复状态2
		origin1.getStateFromMemento(list.getStateIndex(1));
		System.out.println("the second state is: "+origin1.getState());

	}

}
