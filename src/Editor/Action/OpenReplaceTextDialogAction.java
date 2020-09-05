package Editor.Action;

import Editor.GUI.TextEditor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class OpenReplaceTextDialogAction extends AbstractTextEditorAction {

    public OpenReplaceTextDialogAction(String name, TextEditor editor, int keyCode) {
        super(editor);
        putValue(Action.NAME, name);
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(keyCode, KeyEvent.CTRL_DOWN_MASK));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        editor.getReplaceDialog().setVisible(true);
    }
}
