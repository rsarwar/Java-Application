/**
 * */
package RunnerStuff;
 import javafx.animation.AnimationTimer;
 import javafx.animation.KeyFrame;
 import javafx.animation.Timeline;
 import javafx.application.Application;
 import javafx.event.EventHandler;
 import javafx.stage.Stage;
 import javafx.util.Duration;
 import javafx.scene.Group;
 import javafx.scene.Scene;
 import javafx.scene.control.Button;
 import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
 import javafx.scene.Group;
 import javafx.scene.Scene; 
 import javafx.scene.image.Image;
 import javafx.scene.image.ImageView;
 import javafx.scene.layout.HBox;
 import javafx.scene.paint.Color;
 import javafx.stage.Stage; 
public class Testrunner extends Application{
private Scene scene;
private Stage stage;
	@Override public void start(Stage stage) throws FileNotFoundException {
      this.stage = stage;
	
      scene = new Scene(loadScreenOne(), 3000, 1000);
      stage.setScene(scene);
      stage.show();
    }
	
    public static void main(String[] args) {
        Application.launch(args);
    }
    public StackPane loadScreenOne()
    {
        StackPane vBox = new StackPane();
        vBox.setAlignment(Pos.CENTER);
stage.setTitle("All Around the World of Africa");
		
		//stage.getStylesheets().add("http://fonts.googleapis.com/css?family=Gafata");
		
		/*Image image = new Image(new FileInputStream("africa-regions-map.jpg"));
		ImageView imageView = new ImageView(image);
		imageView.setTranslateX(-600);
		imageView.setTranslateY(50);
		imageView.setFitHeight(580);
		imageView.setFitWidth(550);*/
		Image image = new Image("images/africa-regions-map.jpg");
		ImageView imageView = new ImageView(image);
		imageView.setTranslateX(-600);
		imageView.setTranslateY(50);
		imageView.setFitHeight(580);
		imageView.setFitWidth(550);
        imageView.setPreserveRatio(true);
		
		//StackPane root = new StackPane();
		/*Image imageDecline = new Image(getClass().getResourceAsStream("not.png"));
		Button button5 = new Button();
		button5.setGraphic(new ImageView(imageDecline));*/
		//Button btn3 = new Button();
		Button btn1 = new Button();
		Button btn2 = new Button();
		Button btn3 = new Button();
		Button btn4 = new Button();
		Button btn5 = new Button();
		//Select button3 = new Select(btn3,-40,-100,100,100);
		//Select button2 = new Select(btn2,-140,-80,100,200);
		Image regionOne = new Image("images/NORTH.png");
		btn1.setGraphic(new ImageView(regionOne));
		Image regionTwo = new Image("images/WEST.png");
		btn2.setGraphic(new ImageView(regionTwo));
		Image regionThree = new Image("images/SOUTHERN.png");
		btn3.setGraphic(new ImageView(regionThree));
		Image regionFour = new Image("images/EASTERN.png");
		btn4.setGraphic(new ImageView(regionFour));
		Image regionFive = new Image("images/CENTRAL.png");
		btn5.setGraphic(new ImageView(regionFive));
	
		Select button1 = new Select(btn1,-60,-140,"images/NORTH.png", "images/NORTH_ONE.png");
		Select button2 = new Select(btn2,-160,-90,"images/WEST.png", "images/WEST_ONE.png");
		Select button3 = new Select(btn3,40,280,"images/SOUTHERN.png", "images/SOUTHERN_ONE.png");
		Select button4 = new Select(btn4,160,80,"images/EASTERN.png", "images/EASTERN_ONE.png");
		Select button5 = new Select(btn5,15,25,"images/CENTRAL.png", "images/CENTRAL_ONE.png");
		
		button1.getButton().addEventHandler(MouseEvent.MOUSE_CLICKED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          //FAEFDSAD
		          public void handle(MouseEvent e) {
		        	  
		        	 
		      		          
		      		  button1.getButton().getScene().setRoot(loadScreenTwo());  
		      		          
		      		        
			      		
		      		//stage.show();
		  
		      		
		        	  
		        	  //gdsgv
		          }
		        });
		button2.getButton().addEventHandler(MouseEvent.MOUSE_CLICKED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          //FAEFDSAD
		          public void handle(MouseEvent e) {
		        	  StackPane root1 = new StackPane();
		        	  Scene scene1 = new Scene(root1, 830,800);
		      		//stage.setTitle = ("Map of Africa");
		      		stage.setScene(scene1);
		      		stage.show();
		        	  
		        	  //gdsgv
		          }
		        });
		button3.getButton().addEventHandler(MouseEvent.MOUSE_CLICKED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          //FAEFDSAD
		          public void handle(MouseEvent e) {
		        	  StackPane root1 = new StackPane();
		        	  Scene scene1 = new Scene(root1, 830,800);
		      		//stage.setTitle = ("Map of Africa");
		      		stage.setScene(scene1);
		      		stage.show();
		        	  
		        	  //gdsgv
		          }
		        });
		button4.getButton().addEventHandler(MouseEvent.MOUSE_CLICKED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          //FAEFDSAD
		          public void handle(MouseEvent e) {
		        	  StackPane root1 = new StackPane();
		        	  Scene scene1 = new Scene(root1, 830,800);
		      		//stage.setTitle = ("Map of Africa");
		      		stage.setScene(scene1);
		      		stage.show();
		        	  
		        	  //gdsgv
		          }
		        });
		button5.getButton().addEventHandler(MouseEvent.MOUSE_CLICKED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          //FAEFDSAD
		          public void handle(MouseEvent e) {
		        	  StackPane root1 = new StackPane();
		        	  Scene scene1 = new Scene(root1, 830,800);
		      		//stage.setTitle = ("Map of Africa");
		      		stage.setScene(scene1);
		      		stage.show();
		        	  
		        	  //gdsgv
		          }
		        });
		
		Image profile = new Image("images/profile.png");
		ImageView pImageView = new ImageView(profile);
		pImageView.setTranslateX(-800);
		pImageView.setTranslateY(-350);
	
		Button wahoo = new Button();
		
		Image icon = new Image("images/wahoorat.png");
		//ImageView iconView = new ImageView(icon);
		
		wahoo.setGraphic(new ImageView(icon));
		wahoo.setTranslateX(-800);
		wahoo.setTranslateY(350);
		wahoo.addEventHandler(MouseEvent.MOUSE_CLICKED,
		        new EventHandler<MouseEvent>() {
	          @Override
	          //FAEFDSAD
	          public void handle(MouseEvent e) {
	        	  String path = "C:\\Users\\BT_1N3_06\\git\\Java-Application\\All Around the World of Africa\\src\\Alice.mp3";
	        	  
	        	    //final URL resource = getClass().getResource("name.mp3");
	        	    final Media media = new Media(new File(path).toURI().toString());
	        	    
	        	    final MediaPlayer mediaPlayer = new MediaPlayer(media);
	        	    
	        	    mediaPlayer.play();
	          }
	        });
		
		Text t = new Text();
		t.setText("The Majestical World of Africa");
		t.setFont(Font.font("Verdana", 50));
		t.setTextAlignment(TextAlignment.CENTER);
		t.setFill(Color.BLACK);
		t.setTranslateY(-400.0f);
		StackPane root = new StackPane();
		StackPane root3 = new StackPane();
		StackPane root1 = new StackPane();
		StackPane root2 = new StackPane();

		root3.getChildren().addAll(root1,root2,button1.getButton(),button2.getButton(),button3.getButton(),button4.getButton(),button5.getButton());
		root1.getChildren().add(pImageView);
		root2.getChildren().add(wahoo);
		
		imageView.setPreserveRatio(true);
        
        
        vBox.getChildren().addAll(root3);
        vBox.setStyle("-fx-background-color: #8fbc8f;");
        return vBox;
    }

    public StackPane loadScreenTwo()
    {
    	  StackPane vBox = new StackPane();
        vBox.setAlignment(Pos.CENTER);
        final Button button = new Button("Back");
        button.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                button.getScene().setRoot(loadScreenOne());             
            }
        });
        Text text = new Text("Screen Two");
        vBox.getChildren().addAll(text, button);
        return vBox;
    }

}

