public class MusicPlayer {

	public static void main(String args[]) {
		MusicPlayer musicPlayer = new MusicPlayer();
		musicPlayer.playMusic("streamingApp");
		musicPlayer.playMusic("record player");
		musicPlayer.playMusic("car player");
	}

	private void playMusic(String playerType) {
		if(playerType == "streamingApp"){
			System.out.println("favorite playlist now streaming");
		} else if(playerType == "recordPlayer"){
			System.out.println("spinning record and music is playing");
		} else {
			System.out.println("music player not supported, plese choose another");
		}
	}

}
