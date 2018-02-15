package RunnerStuff;


import java.io.File;
import java.net.URL;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Sounds {

	
	private String path;
	
	public Sounds(String url)
	{
		this.path = url;
	}
	public void play()
	{
		 final Media media = new Media(new File(this.path).toURI().toString());
		    
		    final MediaPlayer mediaPlayer = new MediaPlayer(media);
		    
		    mediaPlayer.play();
	}
  
}