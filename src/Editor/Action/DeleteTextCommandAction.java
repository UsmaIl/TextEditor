package Editor.Action;

import Editor.Commands.Command;
import Editor.Commands.DeleteCommand;
import Editor.GUI.TextEditor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;

public class DeleteTextCommandAction extends AbstractTextEditorAction {
    public DeleteTextCommandAction(String name, TextEditor editor, int keyCode) {
        super(editor);
        putValue(Action.NAME, name);
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(keyCode, InputEvent.ALT_DOWN_MASK));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        editor.executeCommand(new DeleteCommand(editor));
    }
}
