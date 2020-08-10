package Editor.Action;

import Editor.GUI.TextEditor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

class SaveFileAction extends AbstractTextEditorAction {
    public SaveFileAction(String name, TextEditor editor, Icon icon) {
        super(name, editor);
        putValue(Action.SMALL_ICON, icon);
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
