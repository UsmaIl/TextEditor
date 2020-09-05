package Editor.Commands;

import Editor.GUI.TextEditor;
import TextSearch.SearchResult;

public class NextCommand extends Command {
    public NextCommand(TextEditor editor) {
        super(editor);
    }

    public boolean execute() {
        SearchResult searchResult = editor.getSearchResult();
        if (searchResult == null) return false;
        searchResult.resetIndex();
        if (searchResult.hasResult()) {
            int result = searchResult.getNext().getIndex();
            int length = searchResult.getElement().getLength();
            editor.getTextArea().selectCurrentText(result,  length);
        }
        return false;
    }
}
