package Editor.Action;

import Editor.GUI.TextEditor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class SearchTextAction extends AbstractTextEditorAction {

    protected SearchTextAction(TextEditor editor, Icon icon) {
        super(editor);
        putValue(Action.SMALL_ICON, icon);
    }

    protected SearchTextAction(TextEditor editor, String name, int keyCode) {
        super(editor);
        putValue(Action.NAME, name);
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(keyCode, KeyEvent.CTRL_DOWN_MASK));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        editor.getSearchResult().searchText(
                editor.getControlBar().getSearchField().getText(),
                editor.getTextArea().getText(),
                editor.getControlBar().getCheckBoxOfUseRegex()
                );
    }
}
