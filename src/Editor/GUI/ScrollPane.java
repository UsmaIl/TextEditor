package Editor.GUI;

import javax.swing.*;
import java.awt.*;

public class ScrollPane extends JScrollPane {
    public ScrollPane(Component textArea) {
        super(textArea);
        setBorder(BorderFactory.createEmptyBorder(0, 7, 7, 7));
        setName("ScrollPane");
    }
}
