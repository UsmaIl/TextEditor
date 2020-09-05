package Editor.Action;

import Editor.Commands.PasteCommand;
import Editor.GUI.TextEditor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class PasteTextCommandAction extends AbstractTextEditorAction {

    public PasteTextCommandAction(String name, TextEditor editor, int keyCode) {
        super(editor);
        putValue(Action.NAME, name);
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(keyCode, KeyEvent.ALT_DOWN_MASK));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        editor.executeCommand(new PasteCommand(editor));
    }
}