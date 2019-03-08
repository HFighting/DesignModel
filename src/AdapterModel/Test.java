package AdapterModel;

public class Test {

	public static void main(String[] args) {
		rmvbMediaPlayer player = new rmvbMediaPlayer();
		player.play("mp3", "好久不见.mp3");
		player.play("rmvb", "树先生.rmvb");
		player.play("ape", "远光.ape");
	}

}
