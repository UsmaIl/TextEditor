package Editor.Action;

import Editor.GUI.TextEditor;

import javax.swing.*;
import java.awt.*;
import java.util.List;


public class ActionFactory {
    private final AbstractAction newFileAction;
    private final AbstractAction openFileAction;
    private final AbstractAction saveFileAction;

    public ActionFactory(TextEditor editor) {
        String iconsDir = System.getProperty("user.dir") + "/resources/icons/";
        ImageIcon iconNew = new ImageIcon(iconsDir + "new_icons.png");
        ImageIcon iconOpen = new ImageIcon(iconsDir + "open_icons.png");
        ImageIcon iconSave = new ImageIcon(iconsDir + "save_icons.png");

        for (ImageIcon icon : List.of(iconNew,iconOpen, iconSave)) {
            Image image = icon.getImage();
            icon.setImage(image.getScaledInstance(20, 20, Image.SCALE_FAST));
        }

        newFileAction = new NewFileAction("New file", editor, iconNew);
        openFileAction = new OpenFileAction("Open file", editor, iconOpen);
        saveFileAction = new SaveFileAction("Save file", editor, iconSave);
    }

    public AbstractAction getNewFileAction() {
        return newFileAction;
    }

    public AbstractAction getOpenFileAction() {
        return openFileAction;
    }

    public AbstractAction getSaveFileAction() {
        return saveFileAction;
    }

}
