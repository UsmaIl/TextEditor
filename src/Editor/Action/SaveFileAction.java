package Editor.Action;

import Editor.GUI.TextEditor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

class SaveFileAction extends AbstractTextEditorAction {

    public SaveFileAction(TextEditor editor, Icon icon) {
        super(editor);
        putValue(Action.SMALL_ICON, icon);
        putValue(Action.SHORT_DESCRIPTION, "Open file chooser dialog to save file");
    }

    public SaveFileAction(String name, TextEditor editor, int keyCode) {
        super(editor);
        putValue(Action.NAME, name);
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(keyCode, KeyEvent.CTRL_DOWN_MASK));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        editor.getFileChooser().setSelectedFile(new File("*.txt"));
        int result = editor.getFileChooser().showSaveDialog(editor);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = editor.getFileChooser().getSelectedFile();
            try {
                editor.getTextArea().write(Files.newBufferedWriter(selectedFile.toPath()));
            } catch (IOException exc) {
                exc.printStackTrace();
            }
        }
    }
}
