package Editor.Action;

import Editor.GUI.TextEditor;

import javax.swing.*;

abstract class AbstractTextEditorAction extends AbstractAction {
    protected final TextEditor editor;

    protected AbstractTextEditorAction(TextEditor editor) {
        this.editor = editor;
    }


}
