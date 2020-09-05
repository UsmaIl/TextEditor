package Editor.Action;

import Editor.GUI.TextEditor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

class OpenFileAction extends AbstractTextEditorAction {

    public OpenFileAction(TextEditor editor, Icon icon) {
        super(editor);
        putValue(Action.SMALL_ICON, icon);
        putValue(Action.SHORT_DESCRIPTION, "Open file chooser dialog to open file");
    }

    public OpenFileAction(String name, TextEditor editor, int keyCode) {
        super(editor);
        putValue(Action.NAME, name);
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(keyCode, InputEvent.CTRL_DOWN_MASK));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int result = editor.getFileChooser().showOpenDialog(editor);
        if (result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = editor.getFileChooser().getSelectedFile();
            try {
                editor.getTextArea().read(Files.newBufferedReader(selectedFile.toPath()), null);
            } catch (IOException exc) {
                exc.printStackTrace();
            }
        }
    }
}
