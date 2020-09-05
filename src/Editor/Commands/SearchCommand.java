package Editor.Commands;

import Editor.GUI.TextEditor;

public class SearchCommand extends Command {
    public SearchCommand(TextEditor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.getSearchResult().searchText(
                editor.getControlBar().getSearchField().getText(),
                editor.getTextArea().getText(),
                editor.getControlBar().getCheckBoxOfUseRegex()
        );
        return false;
    }
}
