package Editor.Action;

import Editor.GUI.TextEditor;

import javax.swing.*;

abstract class AbstractTextEditorAction extends AbstractAction {
    protected final TextEditor editor;

    protected AbstractTextEditorAction(String name, TextEditor editor) {
        super(name);
        this.editor = editor;
    }
}
