package Editor.Action;

import Editor.GUI.TextEditor;
import TextSearch.SearchResult;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SelectAllFoundTextAction extends AbstractTextEditorAction {

    public SelectAllFoundTextAction(String name, TextEditor editor) {
        super(editor);
        putValue(Action.NAME, name);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SearchResult searchResult = editor.getSearchResult();

        if (searchResult == null ) return;

        editor.getSearchResult().searchText(
                editor.getReplaceDialog().getTextFieldForSearch().getText(),
                editor.getTextArea().getText(),
                editor.getControlBar().getCheckBoxOfUseRegex()
        );

        searchResult.resetIndex();
        if (searchResult.hasResult()) {
            int result = searchResult.getNext().getIndex();
            int length = searchResult.getElement().getLength();
            editor.getTextArea().selectCurrentText(result,  length);
        }

        int i = 0;
        editor.getTextArea().removeAllHighlighte();
        while (i < searchResult.getCountFoundAllIndex()) {
            int result = searchResult.getNext().getIndex();
            int length = searchResult.getElement().getLength();
            editor.getTextArea().selectAllText(result, length);
            i++;
        }
    }
}
