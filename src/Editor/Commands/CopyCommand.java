package Editor.Commands;

import Editor.GUI.TextEditor;


public class CopyCommand extends Command {

    public CopyCommand(TextEditor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.setClipboard(editor.getTextArea().getSelectedText());
        return false;
    }

}
