package Editor.Action;

import Editor.Commands.NextCommand;
import Editor.Commands.SearchCommand;
import Editor.Commands.UndoCommand;
import Editor.GUI.TextEditor;
import TextSearch.SearchResult;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class SearchTextAction extends AbstractTextEditorAction {

    protected SearchTextAction(TextEditor editor, Icon icon) {
        super(editor);
        putValue(Action.SMALL_ICON, icon);
        putValue(Action.SHORT_DESCRIPTION, "Start search text for a given pattern");
    }

    protected SearchTextAction(String name, TextEditor editor, int keyCode) {
        super(editor);
        putValue(Action.NAME, name);
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(keyCode, KeyEvent.CTRL_DOWN_MASK));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        editor.executeCommand(new SearchCommand(editor));
        editor.executeCommand(new NextCommand(editor));
    }
}
