package RunnerStuff;


import java.io.File;
import java.net.URL;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Talent extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
	String path = "C:\\Users\\BT_1N3_06\\git\\Java-Application\\All Around the World of Africa\\src\\name.mp3";
	  
    //final URL resource = getClass().getResource("name.mp3");
    final Media media = new Media(new File(path).toURI().toString());
    
    final MediaPlayer mediaPlayer = new MediaPlayer(media);
    
    mediaPlayer.play();

    primaryStage.setTitle("Audio Player 1");
    primaryStage.setWidth(200);
    primaryStage.setHeight(200);
    primaryStage.show();
  }
}