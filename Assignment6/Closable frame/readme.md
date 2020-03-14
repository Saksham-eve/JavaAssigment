# Closable Frame in Java
We can close the AWT Window or Frame by calling dispose() or System.exit() inside windowClosing() method. The windowClosing() method is found in WindowListener interface and WindowAdapter class.

The WindowAdapter class implements WindowListener interfaces. It provides the default implementation of all the 7 methods of WindowListener interface. To override the windowClosing() method, you can either use WindowAdapter class or WindowListener interface.

If you implement the WindowListener interface, you will be forced to override all the 7 methods of WindowListener interface. So it is better to use WindowAdapter class.


## Example
````javascript 
import javax.swing.JFrame;
import java.awt.event.WindowAdapter;  
import java.awt.event.*; 
class winclose extends WindowAdapter  
{
 
public void windowClosing(WindowEvent we) 
{
System.exit(0);
}
}
 
class JFrame2
{
public static void main(String args[])
{
JFrame n = new JFrame();
winclose w=new winclose();
n.addWindowListener(w); 
n.setTitle("closable JFrame");
n.setSize(200,200);
n.setVisible(true); 
n.setLocation(50,100); 
}
}
```