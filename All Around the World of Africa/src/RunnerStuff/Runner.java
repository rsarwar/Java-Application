
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
		Button btn3 = new Button();
		Button btn1 = new Button();
		Button btn2 = new Button();
		Select button3 = new Select(btn3,-40,-100,100,100);
		Select button2 = new Select(btn2,-140,-80,100,200);
		Select button1 = new Select(btn1,-40,-200,100,300);
		button1.getButton().addEventHandler(MouseEvent.MOUSE_CLICKED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent e) {
		        	  StackPane root1 = new StackPane();
		        	  Scene scene1 = new Scene(root1, 830,800);
		      		//stage.setTitle = ("Map of Africa");
		      		stage.setScene(scene1);
		      		stage.show();
		        	  
		        	  
		          }
		        });
		root.getChildren().addAll(imageView,button1.getButton(),button2.getButton(),button3.getButton());
		
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
        Application.launch(args);
    }
}
