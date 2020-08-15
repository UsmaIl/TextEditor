package Editor.Commands;

import Editor.GUI.TextEditor;

public class DeleteCommand extends Command {

    public DeleteCommand(TextEditor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.getTextArea().getSelectedText() == null ||
                editor.getTextArea().getSelectedText().isEmpty()) return false;
        backup();
        String source = editor.getTextArea().getText();
        editor.getTextArea().setText(deleteString(source));
        return true;
    }

    private String deleteString(String source) {
        String start = source.substring(0, editor.getTextArea().getSelectionStart());
        String end = source.substring(editor.getTextArea().getSelectionEnd());
        return start + end;
    }

}
