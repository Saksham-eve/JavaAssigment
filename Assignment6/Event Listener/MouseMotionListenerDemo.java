import java.awt.* ;
import java.awt.event.*;

public class MouseMotionListenerDemo implements MouseMotionListener{

	public void mouseMoved(MouseEvent e){

        System.out.println("Mouse Moved") ;
        
	}
	public void mouseDragged(MouseEvent e){

        System.out.println("Mouse Dragged") ;
        
	}
}