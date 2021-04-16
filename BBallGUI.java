import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
/**
 *  @author: Adam Aguirre
 *  Assignment 11
 *  Date: 
 */
public class BBallGUI extends JFrame {

    public BBallGUI() {
        setSize(450, 350);
        setResizable(false);
        setTitle("My BBall Stats Program");

        Container pane = getContentPane();
        JMenuBar menu = new JMenuBar();
        setJMenuBar(menu);
        pane.add(new BBallPanel(menu));

    }

    public static void main(String[] args) {
        BBallGUI frame = new BBallGUI();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}