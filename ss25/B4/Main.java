package ss25.B4;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

interface MediaPlayer{
	public void play(String audioType,String fileName);
}
 class AdvancedMediaPlayer  {
	public void playMp4(String filename){
			System.out.println("dang choi mp4"+filename);
	}
	public void playVlc(String filename){
			System.out.println("dang choi vlc"+filename);
	}
	
}
class MediaAdapter implements MediaPlayer {
	private AdvancedMediaPlayer AdvancedMediaPlayer;
	public MediaAdapter(){
		AdvancedMediaPlayer = new AdvancedMediaPlayer();
	}
	@Override
	public  void play(String audioType, String fileName) {
		if(audioType.equals("mp4")){
			AdvancedMediaPlayer.playMp4(fileName);
		}else if(audioType.equals("vlc")){
			AdvancedMediaPlayer.playVlc(fileName);
		}
	}
	
}
public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			MediaAdapter adapter = new MediaAdapter();
			adapter.play("mp4", "nhac mp4");
			adapter.play("vlc", "nhac vcl");
		}	
}
