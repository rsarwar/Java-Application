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
		Image image;
		try {
			image = new Image(new FileInputStream("wahoorat.png"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ImageView imageView = new ImageView(image);
		imageView.setX(300);
		imageView.setY(400);
		
		//have the icon greet the user
	}
	
	public static void hoverOverCountry()
	{
		
	}
	
	public static void showData()
	{
		
	}
	
}
