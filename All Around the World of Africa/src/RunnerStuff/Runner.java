
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
 import javafx.scene.text.Text;

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
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
 import javafx.geometry.Rectangle2D;
 import javafx.scene.Group;
 import javafx.scene.Scene; 
 import javafx.scene.image.Image;
 import javafx.scene.image.ImageView;
 import javafx.scene.layout.HBox;
 import javafx.scene.paint.Color;
 import javafx.stage.Stage; 

 /*
  * Miriam Monroe and Ramisha Sarwar
  */
public class Runner extends Application{

	@Override public void start(Stage stage) throws FileNotFoundException {
        
		Image image = new Image(new FileInputStream("africa-regions-map.jpg"));
		ImageView imageView = new ImageView(image);
		imageView.setX(5);
		imageView.setY(25);
		imageView.setFitHeight(830);
		imageView.setFitWidth(800);
		
		
		imageView.setPreserveRatio(true);
		
		StackPane root = new StackPane();
		/*Image imageDecline = new Image(getClass().getResourceAsStream("not.png"));
		Button button5 = new Button();
		button5.setGraphic(new ImageView(imageDecline));*/
		//Button btn3 = new Button();
		Button btn1 = new Button();
		Button btn2 = new Button();
		//Select button3 = new Select(btn3,-40,-100,100,100);
		//Select button2 = new Select(btn2,-140,-80,100,200);
		Image regionOne = new Image("images/NORTH_AFRICA.png");
		btn1.setGraphic(new ImageView(regionOne));
		Image regionTwo = new Image("images/WEST_AFRICA_ONE.png");
		btn2.setGraphic(new ImageView(regionTwo));
		Select button1 = new Select(btn1,0,0,0,0,"images/NORTH_AFRICA.png", "images/NORTH_AFRICA_TWO.png");
		Select button2 = new Select(btn2,0,200,0,0,"images/WEST_AFRICA_ONE.png", "images/WEST_AFRICA_TWO.png");
		
		button1.getButton().addEventHandler(MouseEvent.MOUSE_CLICKED,
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
		root.getChildren().addAll(imageView,button1.getButton(),button2.getButton()/*button3.getButton()*/);
		
		Scene scene = new Scene(root, 830,800);
		//stage.setTitle = ("Map of Africa");
		
		
		root.addEventHandler(MouseEvent.MOUSE_PRESSED,
			       new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			        	  int x=(int) e.getX();
						   int y=(int) e.getY();
						
						  System.out.println(x+","+y);
			          }
			        });
		
		stage.setScene(scene);
		stage.show();
		
    }
	
    public static void main(String[] args) {
    	File data1 = new File("africa.csv");
    	File data2 = new File("users.csv");
    	File data3 = new File("chatlogs.csv");
		CSVWorldUtilities africaData = new CSVWorldUtilities();
		africaData.CSVUtilities(data1);
		
		CSVUserUtilities userData = new CSVUserUtilities();
		userData.CSVUtilities(data2);
		//userData.printData();
		userData.username = "heck";
		userData.password = "heck3";
		//userData.writeCSV(data2);
		
		//CSVChatUtilities chatLogs = new CSVChatUtilities();
		//chatLogs.CSVUtilities(data3);
		//chatLogs.writeCSV(data3, "APPLES");
		
		Region northRegion = new Region("North");
		northRegion.addCountries(africaData);
		northRegion.printNamesOfCountries();
		northRegion.printInfoOfCountries();
		
		//x.printData();
		System.out.println(africaData.getDataString(3));
		System.out.println(africaData.searchRegion("North"));
		System.out.println(africaData.numColumns);
		
        Application.launch(args);
    }
}
