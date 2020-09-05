package Editor.Action;

import Editor.GUI.TextEditor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;

public class NewFileAction extends AbstractTextEditorAction {

    public NewFileAction(String name, TextEditor editor, int keyCode) {
        super(editor);
        putValue(Action.NAME, name);
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(keyCode, InputEvent.CTRL_DOWN_MASK));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        editor.getTextArea().setText("");
    }
}