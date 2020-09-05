package Editor.GUI;

import Editor.Action.ActionFactory;

import javax.swing.*;

public class Menu extends JMenuBar {
    public Menu(ActionFactory factory) {
        var menuFile = new JMenu("File") {{
            add(new JMenuItem(factory.getNewFileActionForMenu()));
            add(new JMenuItem(factory.getOpenFileActionForMenu()));
            add(new JMenuItem(factory.getSaveFileActionForMenu()));
            addSeparator();
            add(new JMenuItem("Exit"))
                    .addActionListener(event -> System.exit(0));
        }};

        var menuEdit = new JMenu("Edit") {{
            add(new JMenuItem(factory.getUndoLastActionForMenu()));
            addSeparator();
            add(new JMenuItem(factory.getCutTextActionForMenu()));
            add(new JMenuItem(factory.getCopyTextActionForMenu()));
            add(new JMenuItem(factory.getPasteTextActionForMenu()));
            add(new JMenuItem(factory.getDeleteTextActionForMenu()));
            addSeparator();
            add(new JMenuItem(factory.getSearchTextActionForMenu()));
            add(new JMenuItem(factory.getNextTextActionForMenu()));
            add(new JMenuItem(factory.getPreviousTextActionForMenu()));
            add(new JMenuItem(factory.getPasteTextActionForMenu()));
            add(new JMenuItem(factory.getReplaceTextActionForMenu()));
            addSeparator();
            add(new JMenuItem(factory.getSelectAllTextActionForMenu()));
        }};

        var menuFormat = new JMenu("Format") {{
            add(new JMenuItem("Font"));
        }};

        add(menuFile);
        add(menuEdit);
        add(menuFormat);
    }
}
