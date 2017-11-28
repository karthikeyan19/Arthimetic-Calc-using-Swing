
import java.awt.Dimension;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.*;
import javax.swing.BorderFactory;

class JTableInNullLayout
{
  public static void main(String[] argv) throws Exception {

      JPanel panel = new JPanel(null);
      JLabel helloLabel = new JLabel("Hello world!");
      helloLabel.setBounds( 200, 200, 100, 40 ); // x, y, width, height
      helloLabel.setLocation(100,20);
      Border lineBorder=BorderFactory.createLineBorder(Color.yellow,3);
      Border matteBorder= BorderFactory.createMatteBorder(10,10,10,10,Color.red);
      Border emptyBorder=BorderFactory.createEmptyBorder(10,10,10,10);
     //panel.setBorder(BorderFactory.createLineBorder(Color.red,3));
     //panel.setBorder(BorderFactory.createMatteBorder(10,10,10,10,Color.red));
      panel.setBorder(BorderFactory.createCompoundBorder(emptyBorder,matteBorder));
      panel.add(helloLabel);
      JFrame frame = new JFrame();
      frame.add(panel);
     //frame.setSize(300,300);
      frame.getContentPane().setForeground(Color.YELLOW);
      frame.setSize( 300,300);
     //frame.add(helloLabel);
      frame.setVisible(true);
  }
}
