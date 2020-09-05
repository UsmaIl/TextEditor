package Editor.Action;

import Editor.GUI.TextEditor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;


public class ActionFactory {
    private final AbstractAction newFileActionForMenu;
    private final AbstractAction openFileActionForMenu;
    private final AbstractAction saveFileActionForMenu;
    private final AbstractAction undoLastActionForMenu;
    private final AbstractAction cutTextActionForMenu;
    private final AbstractAction copyTextActionForMenu;
    private final AbstractAction pasteTextActionForMenu;
    private final AbstractAction deleteTextActionForMenu;
    private final AbstractAction searchTextActionForMenu;
    private final AbstractAction nextTextActionForMenu;
    private final AbstractAction previousTextActionForMenu;
    private final AbstractAction selectAllTextActionForMenu;
    private final AbstractAction replaceTextActionForMenu;

    private final AbstractAction openFileActionForControlBar;
    private final AbstractAction saveFileActionForControlBar;
    private final AbstractAction searchTextActionForControlBar;
    private final AbstractAction previousTextActionForControlBar;
    private final AbstractAction nextTextActionForControlBar;

    private final AbstractAction selectAllFoundTextActionForReplaceDialog;

    public ActionFactory(TextEditor editor) {
        String iconsDir = System.getProperty("user.dir") + "\\resources\\icons\\";

        ImageIcon iconOpen = new ImageIcon(iconsDir + "open_icon.png");
        ImageIcon iconSave = new ImageIcon(iconsDir + "save_icon.png");
        ImageIcon iconSearchText = new ImageIcon(iconsDir + "search_icon.png");
        ImageIcon iconPreviousText = new ImageIcon(iconsDir + "previous_icon.png");
        ImageIcon iconNextText = new ImageIcon(iconsDir + "next_icon.png");

        for (ImageIcon icon : List.of(iconOpen, iconSave, iconSearchText, iconPreviousText, iconNextText)) {
            Image image = icon.getImage();
            icon.setImage(image.getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        }

        newFileActionForMenu = new NewFileAction("New", editor, KeyEvent.VK_N);
        openFileActionForMenu = new OpenFileAction("Open...", editor, KeyEvent.VK_O);
        saveFileActionForMenu = new SaveFileAction("Save", editor, KeyEvent.VK_S);
        undoLastActionForMenu = new UndoTextCommandAction("Undo", editor, KeyEvent.VK_Z);
        cutTextActionForMenu = new CutTextCommandAction("Cut", editor, KeyEvent.VK_X);
        copyTextActionForMenu = new CopyTextCommandAction("Copy", editor, KeyEvent.VK_C);
        pasteTextActionForMenu = new PasteTextCommandAction("Paste", editor, KeyEvent.VK_V);
        deleteTextActionForMenu = new DeleteTextCommandAction("Delete", editor, KeyEvent.VK_D);
        searchTextActionForMenu = new SearchTextAction("Search", editor, KeyEvent.VK_F);
        nextTextActionForMenu = new NextMatchAction("Next", editor, KeyEvent.VK_F5);
        previousTextActionForMenu = new PreviousMatchAction("Previous", editor, KeyEvent.VK_F5);
        selectAllTextActionForMenu = new SelectAllTextCommandAction("Select All", editor, KeyEvent.VK_A);
        replaceTextActionForMenu = new OpenReplaceTextDialogAction("Replace", editor, KeyEvent.VK_F);

        openFileActionForControlBar = new OpenFileAction(editor, iconOpen);
        saveFileActionForControlBar = new SaveFileAction(editor, iconSave);
        searchTextActionForControlBar = new SearchTextAction(editor, iconSearchText);
        previousTextActionForControlBar = new PreviousMatchAction(editor, iconPreviousText);
        nextTextActionForControlBar = new NextMatchAction(editor, iconNextText);

        selectAllFoundTextActionForReplaceDialog = new SelectAllFoundTextAction("Find all", editor);
    }

    public AbstractAction getNewFileActionForMenu() {
        return newFileActionForMenu;
    }

    public AbstractAction getOpenFileActionForMenu() {
        return openFileActionForMenu;
    }

    public AbstractAction getSaveFileActionForMenu() {
        return saveFileActionForMenu;
    }

    public AbstractAction getUndoLastActionForMenu() {
        return undoLastActionForMenu;
    }

    public AbstractAction getCutTextActionForMenu() {
        return cutTextActionForMenu;
    }

    public AbstractAction getCopyTextActionForMenu() {
        return copyTextActionForMenu;
    }

    public AbstractAction getPasteTextActionForMenu() {
        return pasteTextActionForMenu;
    }

    public AbstractAction getDeleteTextActionForMenu() {
        return deleteTextActionForMenu;
    }

    public AbstractAction getSearchTextActionForMenu() {
        return searchTextActionForMenu;
    }

    public AbstractAction getNextTextActionForMenu() {
        return nextTextActionForMenu;
    }

    public AbstractAction getPreviousTextActionForMenu() {
        return previousTextActionForMenu;
    }

    public AbstractAction getSelectAllTextActionForMenu() {
        return selectAllTextActionForMenu;
    }

    public AbstractAction getReplaceTextActionForMenu() {
        return replaceTextActionForMenu;
    }


    public AbstractAction getOpenFileActionForControlBar() {
        return openFileActionForControlBar;
    }

    public AbstractAction getSaveFileActionForControlBar() {
        return saveFileActionForControlBar;
    }

    public AbstractAction getSearchTextActionForControlBar() {
        return searchTextActionForControlBar;
    }

    public AbstractAction getPreviousTextActionForControlBar() {
        return previousTextActionForControlBar;
    }

    public AbstractAction getNextTextActionForControlBar() {
        return nextTextActionForControlBar;
    }


    public AbstractAction getSelectAllFoundTextActionForReplaceDialog() {
        return selectAllFoundTextActionForReplaceDialog;
    }
}
