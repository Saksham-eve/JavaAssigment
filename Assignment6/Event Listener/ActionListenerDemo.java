import java.awt.*;  
import java.awt.event.*;

//1st step  
public class ActionListenerDemo extends Frame implements ActionListener{

    public static void main(String[] args) {

    new ActionListenerDemo();

    }

    ActionListenerDemo(){

    Button b = new Button("Click Here");  
    b.setBounds(50,100,60,30);

    //2nd step  
    b.addActionListener(this);

    add(b);

    setSize(500,500);  
    setLayout(null);  
    setVisible(true);

    }  
  
    public void actionPerformed(ActionEvent e){  
            System.out.println("Button Clicked");  
    }

}  