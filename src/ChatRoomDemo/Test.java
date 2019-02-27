package ChatRoomDemo;

public class Test {

	public static void main(String[] args) {
		User join = new User("join");
		User jack = new User("jack");
		
		join.sentMessage("Hi,jack!");
		jack.sentMessage("Hi,join!!");
	}

}
