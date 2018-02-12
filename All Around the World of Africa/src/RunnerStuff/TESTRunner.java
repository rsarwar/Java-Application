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
public class TESTRunner extends Application{

	@Override public void start(Stage stage) throws FileNotFoundException {
        
		stage.setTitle("All Around the World of Africa");
		
		//stage.getStylesheets().add("http://fonts.googleapis.com/css?family=Gafata");
		
		Image image = new Image(new FileInputStream("africa-regions-map.jpg"));
		ImageView imageView = new ImageView(image);
		imageView.setTranslateX(-600);
		imageView.setTranslateY(50);
		imageView.setFitHeight(580);
		imageView.setFitWidth(550);
		
		Image profile = new Image(new FileInputStream("profile.png"));
		ImageView pImageView = new ImageView(profile);
		pImageView.setTranslateX(-800);
		pImageView.setTranslateY(-350);
	
		Image icon = new Image(new FileInputStream("wahoorat.png"));
		ImageView iconView = new ImageView(icon);
		iconView.setTranslateX(800);
		iconView.setTranslateY(-350);
		
		Text t = new Text();
		t.setText("The Majestical World of Africa");
		t.setFont(Font.font("Verdana", 50));
		t.setTextAlignment(TextAlignment.CENTER);
		t.setFill(Color.BLACK);
		t.setTranslateY(-400.0f);
		
		imageView.setPreserveRatio(true);
		
		StackPane root = new StackPane();

		root.getChildren().addAll(imageView);
		root.getChildren().addAll(pImageView);
		root.getChildren().addAll(iconView);

		root.getChildren().add(t);
		
		Scene scene = new Scene(root, 3000,1000, Color.CADETBLUE);

		
		stage.setScene(scene);
		stage.show();
		
    }
	
    public static void main(String[] args) {
        Application.launch(args);
    }
}
