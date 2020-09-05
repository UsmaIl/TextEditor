package Editor.Commands;

import Editor.GUI.TextEditor;

public class PasteCommand extends Command {

    public PasteCommand(TextEditor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.getClipboard() == null || editor.getClipboard().isEmpty()) return false;

        backup();
        editor.getTextArea().insert(editor.getClipboard(), editor.getTextArea().getCaretPosition());
        return true;
    }

}
