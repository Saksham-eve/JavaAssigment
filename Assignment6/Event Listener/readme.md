# Event Listener 
Event listeners represent the interfaces responsible to handle events. Java provides various Event listener classes, however, only those which are more frequently used will be discussed. Every method of an event listener method has a single argument as an object which is the subclass of EventObject class. 
For example, mouse event listener methods will accept instance of MouseEvent, where MouseEvent derives from EventObject.

## EventListener Interface
It is a marker interface which every listener interface has to extend. This class is defined in java.util package.

## Class Declaration
### Following is the declaration for java.util.EventListener interface -
* public interface EventListener *

## Event Listener Interfaces
### Following are some of the most commonly used event listeners :

| ** Class ** | ** Description ** |
|------------------- | ------------------------------- |
| Actionlistener |This interface is used for receiving the action events |
| ComponentListener | This interface is used for receiving the component events. |
| ItemListener | This interface is used for receiving the item events. |
| KeyListener | This interface is used for receiving the key events. |
| MouseListener | This interface is used for receiving the mouse events. |
| WindowListener | This interface is used for receiving the window events. |
| AdjustmentListener | This interface is used for receiving the adjustment events. |
| ContainerListener | This interface is used for receiving the container events. |
| MouseMotionListener | This interface is used for receiving the mouse motion events. |
| FocusListener | This interface is used for receiving the focus events. |

## Example
``` javascript
import java.awt.*;  
import java.awt.event.*;  
class AEvent extends Frame implements ActionListener{  
TextField tf;  
AEvent(){  
  
//create components  
tf=new TextField();  
tf.setBounds(60,50,170,20);  
Button b=new Button("click me");  
b.setBounds(100,120,80,30);  
  
//register listener  
b.addActionListener(this);//passing current instance  
  
//add components and set size, layout and visibility  
add(b);add(tf);  
setSize(300,300);  
setLayout(null);  
setVisible(true);  
}  
public void actionPerformed(ActionEvent e){  
tf.setText("Welcome");  
}  
public static void main(String args[]){  
new AEvent();  
}  
}  
```
