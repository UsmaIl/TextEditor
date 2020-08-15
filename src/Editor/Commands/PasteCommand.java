package Editor.Commands;

import Editor.GUI.TextEditor;

public class PasteCommand extends Command {

    public PasteCommand(TextEditor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

        backup();
        editor.getTextArea().insert(editor.clipboard, editor.getTextArea().getCaretPosition());
        return true;
    }

}
