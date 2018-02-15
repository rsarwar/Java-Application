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
import java.io.File;

import javafx.application.Application;

public class TESTING{

	public static void main(String[] args){
    	File data1 = new File("regions.csv");
		CSVRegionUtilities regionData = new CSVRegionUtilities();
		regionData.CSVUtilities(data1);
		
		//x.printData();
		//Prints region names
		System.out.println(regionData.getDataString(0));
	
		//Prints info
		System.out.println(regionData.getDataString(1));
		
		//Prints for selected region
		System.out.println(regionData.getInfoForRegion("South"));
		
		File data2 = new File("africa.csv");
    	File data3 = new File("users.csv");
    	File data4 = new File("chatlogs.csv");
		CSVWorldUtilities africaData = new CSVWorldUtilities();
		africaData.CSVUtilities(data2);
		
		CSVUserUtilities userData = new CSVUserUtilities();
		userData.CSVUtilities(data3);
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
		System.out.println(africaData.searchRegion("Central"));
		System.out.println(africaData.numColumns);
    }
}

