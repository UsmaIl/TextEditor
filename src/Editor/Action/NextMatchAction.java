package Editor.Action;

import Editor.GUI.TextEditor;
import TextSearch.SearchResult;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class NextMatchAction extends AbstractTextEditorAction {

    protected NextMatchAction(TextEditor editor, Icon icon) {
        super(editor);
        putValue(Action.SMALL_ICON, icon);
        putValue(Action.SHORT_DESCRIPTION, "Next match");
    }

    protected NextMatchAction(String name, TextEditor editor, int keyCode) {
        super(editor);
        putValue(Action.NAME, name);
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(keyCode, 0));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SearchResult searchResult = editor.getSearchResult();
        if (searchResult == null) return;
        if (searchResult.hasResult()) {
            int result = searchResult.getNext().getIndex();
            int length = searchResult.getElement().getLength();
            editor.getTextArea().selectCurrentText(result,  length);
        }
    }
}