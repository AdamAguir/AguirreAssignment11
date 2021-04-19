import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JPanel;

public class FileChooser extends AcctionListener{
    
    public FileChooser(BBallPanel panel){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));
         //TODO: Filter file types
        int result = fileChooser.showOpenDialog(panel);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            panel.loadData(selectedFile);
        }
    }

}
