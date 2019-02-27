package ChatRoomDemo;

/*
 * 中介者模式：对象与对象之间存在大量的交互关系，中介者模式是用来降低各个对象通信的复杂性，
 * 中介类封装了对象之间的交互方式。
 * 
 * 例子：QQ群，聊天室，短信平台等
 */

public class ChatRoom {
	public static void showMessage(User user,String message) {
		System.out.println("name:"+user.getName()+",message:"+message);
	}
}
