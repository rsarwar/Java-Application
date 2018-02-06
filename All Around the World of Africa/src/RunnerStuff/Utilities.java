package RunnerStuff;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage; 

public class Utilities {

	public static void setIcon()
	{
		Image image = new Image(new FileInputStream("wahoorat.png"));
		ImageView imageView = new ImageView(image);
	}
	
	public static void showData()
	{
		
	}
}
