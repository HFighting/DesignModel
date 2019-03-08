package AdapterModel;

public class AdapterPlayer implements MediaPlayer {
	
	private AudiaoPlayer audiaoPlayer;

	public AdapterPlayer(String playtype) {
		if (playtype.equalsIgnoreCase("mp3")) {
			audiaoPlayer = new Mp3AudioPlayer();
		}else if (playtype.equalsIgnoreCase("mp4")) {
			audiaoPlayer = new Mp4AudioPlayer();
		}else {
			System.out.println("there is no player to "+playtype+" file...");
			audiaoPlayer = null;
		}
	}

	@Override
	public void play(String type,String name) {
		if (audiaoPlayer!=null) {
			System.out.println("play the "+ type +" file;name is "+name);
			audiaoPlayer.play();
		}
	}
	
	
	
}
