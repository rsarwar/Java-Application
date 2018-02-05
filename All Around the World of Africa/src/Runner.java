 import java.io.FileInputStream;
 import java.io.File;
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

public class Runner extends Application{

	@Override public void start(Stage stage) throws FileNotFoundException {
        
		Image image = new Image(new FileInputStream("africa-regions-map.jpg"));
		ImageView imageView = new ImageView(image);
		imageView.setX(5);
		imageView.setY(25);
		imageView.setFitHeight(455);
		imageView.setFitWidth(500);
		imageView.setPreserveRatio(true);
		Group root = new Group(imageView);
		Scene scene = new Scene(root, 600,500);
		//stage.setTitle = ("Map of Africa");
		stage.setScene(scene);
		stage.show();
		 
    }

    public static void main(String[] args) {
    	File data1 = new File("africa.csv");
    	File data2 = new File("users.csv");
		CSVWorldUtilities x = new CSVWorldUtilities();
		x.CSVUtilities(data1);
		
		CSVUserUtilities y = new CSVUserUtilities();
		y.CSVUtilities(data2);
		y.printData();
		y.username = "heck";
		y.password = "heck3";
		y.writeCSV(data2);
		
		//x.printData();
		System.out.println(x.getDataString(1));
		System.out.println(x.searchRegion("East"));
		 
        Application.launch(args);
        
    }
}
