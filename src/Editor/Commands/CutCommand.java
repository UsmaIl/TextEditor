package Editor.Commands;

import Editor.GUI.TextEditor;

public class CutCommand extends Command {

    public CutCommand(TextEditor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.getTextArea().getSelectedText() == null ||
                editor.getTextArea().getSelectedText().isEmpty()) return false;

        backup();
        String source = editor.getTextArea().getText();
        editor.setClipboard(editor.getTextArea().getSelectedText());
        editor.getTextArea().setText(cutString(source));
        return true;
    }

    private String cutString(String source) {
        String start = source.substring(0, editor.getTextArea().getSelectionStart());
        String end = source.substring(editor.getTextArea().getSelectionEnd());
        return start + end;
    }
}
