package RunnerStuff;

import java.io.FileNotFoundException;

import com.sun.prism.Image;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//Syeda Islam

public class Select {
	
	private Button button;
	private int x,y;//length,width;
	private String imageOne, imageTwo;
	public Select(Button button,int x, int y/*int length, int width, */,String imageOne, String imageTwo)
	{
		//this.Switchimage = image;
		this.button = button;
		this.x = x;
		this.y = y;
		//this.length = length;
		//this.width = width;
		this.imageOne = imageOne;
		this.imageTwo = imageTwo;
		this.button.setStyle("-fx-background-color: transparent;");
		this.button.setTranslateX(this.x);
		this.button.setTranslateY(this.y);
		//this.button.setMaxHeight(this.length);
		//this.button.setMaxWidth(this.width);
		this.button.addEventHandler(MouseEvent.MOUSE_ENTERED,
			       new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			        	  button.setGraphic(new ImageView(imageTwo));
			        	  //button.setStyle("-fx-background-color: linear-gradient(rgba(255, 255, 255, 0.3), rgba(0, 0, 0, 0.2));");
			          }
			        });
			this.button.addEventHandler(MouseEvent.MOUSE_EXITED,
			        new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			        	  button.setGraphic(new ImageView(imageOne));
			        	  //button.setStyle("-fx-background-color: transparent;");
			          }
			        }); 
			/*this.button.addEventHandler(MouseEvent.MOUSE_CLICKED,
			        new EventHandler<MouseEvent>() {
			          @Override
			         
			          public void handle(MouseEvent e) {
			        	   
			      		  button.getScene().setRoot(loadScreenTwo());  
			          }
			        });*/
			
	}
	
	//the regions act as buttons, so when you click on one it will open to a new scene
	public void newRegion(Stage stage)throws FileNotFoundException
	{
		this.button.addEventHandler(MouseEvent.MOUSE_CLICKED,
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
	}
	public Button getButton()
	{
		return this.button;
	}
}
