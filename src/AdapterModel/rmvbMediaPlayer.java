package AdapterModel;

public class rmvbMediaPlayer implements MediaPlayer{
	
	private AdapterPlayer adapterplayer;
	
	@Override
	public void play(String playtype, String filename) {
		if (playtype.equalsIgnoreCase("rmvb")) {
			System.out.println("play the "+ playtype +" file;name is "+filename);
			System.out.println("play the rmvb file...");
		}else {
			adapterplayer = new AdapterPlayer(playtype);
			adapterplayer.play(playtype, filename);
		}
		
		
	}

}
