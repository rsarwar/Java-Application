import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Select {
	
	private Button button;
	private int x,y,length,width;
	public Select(Button button,int x, int y, int length, int width)
	{
		this.button = button;
		this.x = x;
		this.y = y;
		this.length = length;
		this.width = width;
		this.button.setStyle("-fx-background-color: transparent;");
	}
	public void relocate()
	{
		
		this.button.setTranslateX(this.x);
		this.button.setTranslateY(this.y);
	}
	public void setDimensions()
	{
		this.button.setMaxHeight(this.length);
		this.button.setMaxWidth(this.width);
	}
	public void hover()
	{
		this.button.addEventHandler(MouseEvent.MOUSE_ENTERED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent e) {
		        	  button.setStyle("-fx-background-color: linear-gradient(rgba(255, 255, 255, 0.3), rgba(0, 0, 0, 0.2));");
		          }
		        });
		this.button.addEventHandler(MouseEvent.MOUSE_EXITED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent e) {
		        	  button.setStyle("-fx-background-color: transparent;");
		          }
		        });
	}
}
