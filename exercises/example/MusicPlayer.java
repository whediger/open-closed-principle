public class MusicPlayer {
	public static void main(String args[]) {
		StreamingApp streamingApp = new StreamingApp();
		streamingApp.playMusic();
		RecordPlayer recordPlayer = new RecordPlayer();
		recordPlayer.playMusic();
		CarPlayer carPlayer = new CarPlayer();
		carPlayer.playMusic();
	}
}
