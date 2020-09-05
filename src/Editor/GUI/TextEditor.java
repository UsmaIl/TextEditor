package Editor.GUI;

import Editor.Action.ActionFactory;
import Editor.Commands.Command;
import Editor.Commands.CommandHistory;
import TextSearch.SearchResult;

import javax.swing.*;
import java.awt.*;

public class TextEditor extends JFrame {

    private final FileChooser fileChooser;
    private final Menu menu;
    private final ControlBar bar;
    private final TextArea textArea;
    private final SearchResult searchResult;
    private final CommandHistory history;
    private String clipboard;
    private final ReplaceDialog replaceDialog;


    public TextEditor() {
        Toolkit toolKit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolKit.getScreenSize();

        int screenWith = screenSize.width;
        int screenHeight = screenSize.height;

        setTitle("SimpleTextEditor");
        setLocationRelativeTo(null);
        setSize((int) (screenWith / 1.618), (int) (screenHeight / 1.618));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        ActionFactory actionFactory = new ActionFactory(this);

        fileChooser = new FileChooser();

        menu = new Menu(actionFactory);

        bar = new ControlBar(actionFactory);

        textArea = new TextArea();

        searchResult = new SearchResult();

        history = new CommandHistory();

        var scrollPane = new ScrollPane(textArea);

        replaceDialog = new ReplaceDialog(actionFactory);

        setJMenuBar(menu);
        add(bar, BorderLayout.NORTH);
        add(scrollPane);

    }

    public void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    public FileChooser getFileChooser() {
        return fileChooser;
    }

    public Menu getMenu() {
        return menu;
    }

    public ControlBar getControlBar() {
        return bar;
    }

    public TextArea getTextArea() {
        return textArea;
    }

    public SearchResult getSearchResult() { return searchResult; }

    public CommandHistory getCommandHistory() {
        return history;
    }

    public String getClipboard() {
        return clipboard;
    }

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }

    public ReplaceDialog getReplaceDialog() {
        return replaceDialog;
    }
}
