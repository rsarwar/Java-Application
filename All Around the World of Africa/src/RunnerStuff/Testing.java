package RunnerStuff;

import java.awt.event.MouseListener;

import com.sun.glass.events.MouseEvent;

import javafx.scene.layout.StackPane;

public class Testing implements MouseListener{

	
	public static void main (String[] args)
	{
		
	}
	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		  int x=e.getX();
		    int y=e.getY();
		    System.out.println(x+","+y);
		
	}
	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
