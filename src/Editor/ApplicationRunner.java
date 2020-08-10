package Editor;

import Editor.GUI.TextEditor;

import java.awt.*;

public class ApplicationRunner {
    public static void main(String[] args) {
        EventQueue.invokeLater(TextEditor::new);
    }
}
