import java.awt.* ;
import java.awt.event.* ;
class House1 extends Frame{
	House1(){
            addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.out.println("Closed") ;
				dispose() ;
			}
		});
		setSize(500, 500) ;
		setVisible(true) ;
	}
	public void paint(Graphics g){
		int x[] = {40, 230, 420} ;
		int y[] = {200, 100, 200} ;
		g.drawPolygon(new Polygon(x, y, 3)) ;
		g.setColor(new Color(210, 105, 30)) ;
		g.fillPolygon(new Polygon(x, y, 3)) ;//roof
		g.setColor(Color.RED) ;
		g.fillRect(80, 200, 300, 200) ;//house
        g.setColor(new Color(210, 105, 30)) ;
		g.fillRect(120, 250, 50, 80 ) ;//left window
		g.fillRect(290, 250, 50, 80 ) ;//right window
		g.setColor(new Color(160, 82, 45)) ;
		g.fillRect(205, 250, 40, 140) ;//door
		}
	public static void main(String[] args){
		new House1() ;
	}
}