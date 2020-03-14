**Q.1. How do you handle events with an adapter class in Java?** 

Adapter classes provide an implementation of listener interfaces. When you inherit the adapter class implementation for all methods is not mandatory. Thus writing excess code is saved.These adapter classes can be found in java.awt.event, java.awt.dnd and javax.swing.event packages. Some of the common adapter classes with corresponding listener interfaces are given below.
* java.awt.event
* java.awt.dnd
* javax.swing.event

*java.awt.event* 
| **Adapter Class** | **Listener Interface** |
| ----------------------- | -----------------------------|
| WindowAdapter | WindowListener |
| KeyAdapter | KeyListener |
| MouseAdapter | MouseListener |
| MouseMotionAdapter | MouseMotionListener |
| FocusAdapter | FocusListener |
| ComponentAdapter | ComponentListener|
| ContainerAdapter | ContainerListener |
| HierarchyBoundsAdapter | HierarchyBoundsListener |

*java.awt.dnd*
| **Adapter Class** | **Listener Interface** |
| ----------------------- | -----------------------------|
| DragSourceAdapter | DragSourceListener |
| DragTargetAdapter | DragTargetListener |

*javax.swing.event*
| **Adapter Class** | **Listener Interface** |  
| ----------------------- | ---------------------------- |
| MouseInputAdapter | MouseInputListener |
| InternalFrameAdapter | InternalFrameListener |

## Example
``` javascript
import java.awt.*;  
import java.awt.event.*;  
public class MouseMotionAdapterExample extends MouseMotionAdapter{  
    Frame f;  
    MouseMotionAdapterExample(){  
        f=new Frame("Mouse Motion Adapter"); 
        f.addMouseMotionListener(this);  
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
public void mouseDragged(MouseEvent e) {  
    Graphics g=f.getGraphics();  
    g.setColor(Color.ORANGE);  
    g.fillOval(e.getX(),e.getY(),20,20);  
}  
public static void main(String[] args) {  
    new MouseMotionAdapterExample();  
}  
}
```
 
 
