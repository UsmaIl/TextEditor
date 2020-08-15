package Editor.Commands;

import Editor.GUI.TextEditor;

public class UndoCommand extends Command {
    public UndoCommand(TextEditor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.getCommandHistory().isEmpty()) return false;

        Command command = editor.getCommandHistory().pop();
        if (command != null) {
            command.undo();
        }
        return false;
    }
}
