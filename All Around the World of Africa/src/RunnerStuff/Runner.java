/**
  Syeda Islam and Kaitlyn Cao
  2/15/2018
  Interface Team
  Description: Linking the CSV Data and displaying it on the screen * */
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
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;

import java.awt.Insets;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.print.DocFlavor.URL;

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
public class Runner extends Application{
private Scene scene;
private Stage stage;
/*
  Basically in the runner code, we are switching scenes and in order
to do that we must set Scene
  and Stage as private fields in order to be able to readily refer to
them throughout the
  program.  We created two methods which allows us to switch scenes,
thereby giving the allusion
  of going back to the main page
 */

	@Override public void start(Stage stage) throws FileNotFoundException {
	//sets the private field to the parameter
	      this.stage = stage;
	//sets the main stage
	      scene = new Scene(loadScreenOne(), 3000, 1000);
	      stage.setScene(scene);
	      stage.show();
	    }
	//launches the application
	    public static void main(String[] args) {
	        Application.launch(args);
	    }
	   //opens the main menu
	    public StackPane loadScreenOne()
	    {
	    /* We decided to use Stackpane over Group to be able to rearange
	the order of nodes to
	      be able to do things like put text over images
	    */
	        StackPane vBox = new StackPane();
	        vBox.setAlignment(Pos.CENTER);
	        stage.setTitle("All Around the World of Africa");
	//stage.getStylesheets().add("http://fonts.googleapis.com/css?family=Gafata");
	Image image = new Image("images/africa-regions-map.jpg");
	ImageView imageView = new ImageView(image);
	imageView.setTranslateX(-600);
	imageView.setTranslateY(50);
	imageView.setFitHeight(580);
	imageView.setFitWidth(550);
	        imageView.setPreserveRatio(true);
	
	Button btn1 = new Button();
	Button btn2 = new Button();
	Button btn3 = new Button();
	Button btn4 = new Button();
	Button btn5 = new Button();
	//fsdf
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
	/*The select class is hover buttons that take in a button, (x,y)
	coordinates, the original image
	* and hued version of the original image. By switching back and forth,
	we are providing the
	* allusion of hovering.  And in the Select class, the buttons are
	changed to different
	* graphics in order to accomplish this.  The x and y coordinates are
	determined by trial and
	* error as well as this helpful method revealed later on that gives
	you the coordinates when you click
	* on a point in the window
	*/
	Select button1 = new Select(btn1,-60,-140,"images/NORTH.png",
	"images/NORTH_ONE.png");
	Select button2 = new Select(btn2,-160,-90,"images/WEST.png",
	"images/WEST_ONE.png");
	Select button3 = new Select(btn3,40,280,"images/SOUTHERN.png",
	"images/SOUTHERN_ONE.png");
	Select button4 = new Select(btn4,160,80,"images/EASTERN.png",
	"images/EASTERN_ONE.png");
	Select button5 = new Select(btn5,15,25,"images/CENTRAL.png",
	"images/CENTRAL_ONE.png");
	/*
	* The mouse gets clicked and calls the method loadScreenTwo which
	loads to another scene.
	* Although the scenes of the regions may seem consistent, they are
	unique by their images, feuatures, and audio as indicated by the
	* parameters that the function takes in.  By using these parameters,
	the function allows the scene to be unique to the region
	*/
	button1.getButton().addEventHandler(MouseEvent.MOUSE_CLICKED,
	        new EventHandler<MouseEvent>() {
	          @Override
	
	          public void handle(MouseEvent e) {
	
	        button1.getButton().getScene().setRoot(loadScreenTwo("images/Northern_Africa.jpg",0,"North","src\\north.mp3"));
	          }
	        });
	button2.getButton().addEventHandler(MouseEvent.MOUSE_CLICKED,
	        new EventHandler<MouseEvent>() {
	          @Override
	
	          public void handle(MouseEvent e) {
	          button1.getButton().getScene().setRoot(loadScreenTwo("images/Western_Africa.jpg",1,"West","src\\west.mp3"));
	
	          }
	        });
	button3.getButton().addEventHandler(MouseEvent.MOUSE_CLICKED,
	        new EventHandler<MouseEvent>() {
	          @Override
	
	          public void handle(MouseEvent e) {
	          button1.getButton().getScene().setRoot(loadScreenTwo("images/Souther_Africa.jpg",3,"South","src\\south.mp3"));
	          }
	        });
	button4.getButton().addEventHandler(MouseEvent.MOUSE_CLICKED,
	        new EventHandler<MouseEvent>() {
	          @Override
	
	          public void handle(MouseEvent e) {
	          button1.getButton().getScene().setRoot(loadScreenTwo("images/Eastern_Africa.jpg",2,"East","src\\east.mp3"));
	
	          }
	        });
	button5.getButton().addEventHandler(MouseEvent.MOUSE_CLICKED,
	        new EventHandler<MouseEvent>() {
	          @Override
	
	          public void handle(MouseEvent e) {
	          button1.getButton().getScene().setRoot(loadScreenTwo("images/Central_Africa.jpg",4,"Central","src\\central.mp3"));
	          }
	        });
	Image profile = new Image("images/profile.png");
	ImageView pImageView = new ImageView(profile);
	pImageView.setTranslateX(-500);
	pImageView.setTranslateY(-250);
	Button wahoo = new Button();
	Image icon = new Image("images/wahoorat.png");
	wahoo.setGraphic(new ImageView(icon));
	wahoo.setTranslateX(-500);
	wahoo.setTranslateY(200);
	wahoo.addEventHandler(MouseEvent.MOUSE_CLICKED,
	        new EventHandler<MouseEvent>() {
	          @Override
	
	          public void handle(MouseEvent e) {
	          String path = "src\\greeting.mp3";
	          /*
	           * The class Sound allows us to play a media file from the computer
	           * by passing the url through the parameter and it is
	triggered when the user
	           * clicks on wahoo rat
	           */
	          Sounds greeting = new Sounds(path);
	          greeting.play();
	          }
	        });
	Text t = new Text();
	t.setText("The Majestical World of Africa");
	t.setFont(Font.font("Impact", 40));
	t.setTextAlignment(TextAlignment.CENTER);
	t.setFill(Color.BLACK);
	t.setTranslateY(-350);
	t.setTranslateX(0);
	Text u = new Text();
	u.setText("Choose your region");
	u.setFont(Font.font("Verdana", FontWeight.BOLD, 40));
	u.setTextAlignment(TextAlignment.CENTER);
	u.setFill(Color.BLACK);
	u.setTranslateY(-200);
	u.setTranslateX(460);
	Text v = new Text();
	v.setText("Click Me!!!");
	v.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
	v.setTextAlignment(TextAlignment.CENTER);
	v.setFill(Color.BLACK);
	v.setTranslateY(100);
	v.setTranslateX(-500);
	StackPane root = new StackPane();
	StackPane root3 = new StackPane();
	StackPane root1 = new StackPane();
	StackPane root2 = new StackPane();
	root3.getChildren().addAll(t,u,v,root1,root2,button1.getButton(),button2.getButton(),button3.getButton(),button4.getButton(),button5.getButton());
	root1.getChildren().add(pImageView);
	root2.getChildren().add(wahoo);
	imageView.setPreserveRatio(true);
	
	
	        vBox.getChildren().addAll(root3);
	        vBox.setStyle(" -fx-background-color: radial-gradient(center 50% 50% , radius 200px , #ffebcd, #008080)");
	
	        return vBox;
	    }
	
	
	    public StackPane loadScreenTwo(String image, int index, String
	name,String url)
	    {
	    StackPane vBox = new StackPane();
	        vBox.setAlignment(Pos.CENTER);
	        File data1 = new File("regions.csv");
	CSVRegionUtilities regionData = new CSVRegionUtilities();
	regionData.CSVUtilities(data1);
	        final Button button = new Button("Back");
	        Text text3 = new Text("Feautures");
	        text3.setFill(Color.DARKBLUE);
	    text3.setFont(Font.font("Impact", 30));
	        text3.setTranslateX(200);
	        text3.setTranslateY(-200);
	        button.setOnAction(new EventHandler<ActionEvent>() {
	
	            @Override
	            public void handle(ActionEvent arg0) {
	                button.getScene().setRoot(loadScreenOne());
	            }
	        });
	       button.setStyle("-fx-background-color: \r\n" +
	        "        #000000,\r\n" +
	        "        linear-gradient(#7ebcea, #2f4b8f),\r\n" +
	        "        linear-gradient(#426ab7, #263e75),\r\n" +
	        "        linear-gradient(#395cab, #223768);\r\n" +
	        "    -fx-background-insets: 0,1,2,3;\r\n" +
	        "    -fx-background-radius: 3,2,2,2;\r\n" +
	        "    -fx-padding: 12 30 12 30;\r\n" +
	        "    -fx-text-fill: white;\r\n" +
	        "    -fx-font-size: 12px;");
	
	        button.setTranslateX(300);
	        button.setTranslateY(200);
	        Text text = new Text(regionData.getDataString(0).get(index));
	       Text text1 = new Text(regionData.getInfoForRegion(name));
	       text1.setFill(Color.PURPLE);
	       text1.setWrappingWidth(500);
	    text1.setFont(Font.font("Nova Flat", 20));
	       text1.setTranslateX(250);
	
	        Image image1 = new Image(image);
	ImageView imageView = new ImageView(image1);
	imageView.setTranslateX(-300);
	imageView.setTranslateY(0);
	imageView.setFitHeight(580);
	imageView.setFitWidth(550);
	        imageView.setPreserveRatio(true);
	
	
	        text.setTranslateX(-500);
	        Button wahoo = new Button();
	Image icon = new Image("images/wahoorat.png");
	wahoo.setGraphic(new ImageView(icon));
	wahoo.setTranslateX(550);
	wahoo.setTranslateY(200);
	wahoo.addEventHandler(MouseEvent.MOUSE_CLICKED,
	        new EventHandler<MouseEvent>() {
	          @Override
	
	          public void handle(MouseEvent e) {
	          String path = url;
	
	          Sounds greeting = new Sounds(path);
	          greeting.play();
	          }
	        });
	vBox.setStyle("-fx-background-color: lightblue");
	        vBox.getChildren().addAll(imageView,text,text1, text3,wahoo,button);
	
	        return vBox;
    }

}
