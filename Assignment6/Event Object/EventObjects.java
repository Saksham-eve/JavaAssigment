import java.awt.* ;
import java.awt.event.* ;

class EventObjects{
    
	public static void main(String[] args){

        Frame f = new Frame() ;
        
        Button b = new Button("Click Me") ;
        
		b.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){

				//Showing event Object
                System.out.println(e) ;
                
			}
        });
        
        b.setBounds(20, 20, 150, 30) ;
        
		f.add(b) ;
		f.setSize(200, 299) ;
        f.setVisible(true) ;
        
    }
    
}