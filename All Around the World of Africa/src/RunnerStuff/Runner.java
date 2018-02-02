
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
		Button button1 = new Button();
		button1.setTranslateX(-40);
		button1.setTranslateY(-200);
		button1.setMaxHeight(100);
		button1.setMaxWidth(300);
		button1.setStyle("-fx-background-color: transparent;");
		
		
		button1.addEventHandler(MouseEvent.MOUSE_ENTERED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent e) {
		        	  button1.setStyle("-fx-background-color: linear-gradient(rgba(255, 255, 255, 0.3), rgba(0, 0, 0, 0.2));");
		          }
		        });
		button1.addEventHandler(MouseEvent.MOUSE_EXITED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent e) {
		        	  button1.setStyle("-fx-background-color: transparent;");
		          }
		        });
		button1.addEventHandler(MouseEvent.MOUSE_CLICKED,
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
		root.getChildren().addAll(imageView,button1);
		
		Scene scene = new Scene(root, 830,800);
		//stage.setTitle = ("Map of Africa");
		stage.setScene(scene);
		stage.show();
		
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
