package Editor.Commands;

import Editor.GUI.TextEditor;

import java.awt.event.ActionEvent;

public class CopyCommand extends Command {

    public CopyCommand(TextEditor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.getTextArea().getSelectedText();
        return false;
    }

}
