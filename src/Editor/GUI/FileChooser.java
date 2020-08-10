package Editor.GUI;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

public class FileChooser extends JFileChooser {
    public FileChooser() {
        var filter = new FileNameExtensionFilter(
                "Text Files (*.txt, *.log, *.xml, *.json)", "txt", "log", "xml", "json");
        setFileFilter(filter);
        setSelectedFile(new File("."));
    }
}
