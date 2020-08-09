package Editor.GUI;

import javax.swing.*;

public class TextArea extends JTextArea {
    public TextArea() {
        setEditable(true);
        setLineWrap(true);
        setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(),
                BorderFactory.createEmptyBorder(0, 3, 0, 3)));
        setName("TextArea");
    }
}
