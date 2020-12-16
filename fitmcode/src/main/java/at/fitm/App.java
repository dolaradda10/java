package at.fitm;
import java.util.*;
/**
 * Hello world!
 */
import java.awt.*;
import javax.swing.*;
public  class App extends JFrame{
    

    private ImageIcon image1, image2, image3;   

    public App() {
        super("Using ImageIcon");
        setSize(640, 350);
        image1 = new ImageIcon( "logo.gif" );
        image2 = new ImageIcon( "plane.gif" );      
        image3 = new ImageIcon( "beach.jpg" );      
        setVisible(true);
    }    
    public void paint(Graphics g) {
        image1.paintIcon( this, g, 0, 0 );
        image2.paintIcon( this, g, 160, 0 );
        image3.paintIcon( this, g, 320, 0 );
        g.setFont(new Font("Tahoma",Font.BOLD, 14));
        g.setColor(Color.BLUE);
        g.drawString("Width = " + image1.getIconWidth() +
                     " pixel", 10, 180);
        g.drawString("Height = " + image1.getIconHeight()+
                     " pixel", 10, 200);
        g.drawString("Width = " + image2.getIconWidth() +
                     " pixel", 170, 180);
        g.drawString("Height = " + image2.getIconHeight()+
                     " pixel", 170, 200);
        g.drawString("Width = " + image3.getIconWidth() + 
                     " pixel", 330, 260);
         g.drawString("Height = " + image3.getIconHeight()+
                     " pixel", 330, 280);
    }
    
    public static void main(String[] args) {
        App window = new App();
    }
    
}    


