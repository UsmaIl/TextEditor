package Editor.Commands;

import Editor.GUI.TextEditor;


public abstract class Command implements Executable {
    protected TextEditor editor;
    private String backup;

    Command(TextEditor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.getTextArea().getText();
    }

    public void undo() {
        editor.getTextArea().setText(backup);
    }

    public abstract boolean execute();
}
