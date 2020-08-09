package Editor.GUI;

import javax.swing.*;
import java.awt.*;

public class TextEditor extends JFrame {
    public TextEditor() {
        Toolkit toolKit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolKit.getScreenSize();

        int screenWith = screenSize.width;
        int screenHeight = screenSize.height;

        setTitle("SimpleTextEditor");
        setLocationRelativeTo(null);
        setSize((int) (screenWith / 1.618), (int) (screenHeight / 1.618));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        var menu = new Menu();

        var controlBar = new ControlBar("ControlBar");

        var textArea = new TextArea();

        var scrollPane = new ScrollPane(textArea);

        setJMenuBar(menu);
        add(controlBar, BorderLayout.NORTH);
        add(scrollPane);

    }
}
