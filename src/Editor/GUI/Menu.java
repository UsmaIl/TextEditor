package Editor.GUI;

import javax.swing.*;

public class Menu extends JMenuBar {
    public Menu() {
        var menuFile = new JMenu("File") {{
            add(new JMenuItem("New"));
            add(new JMenuItem("Open"));
            add(new JMenuItem("Save"));
            addSeparator();
            add(new JMenuItem("Exit"))
                    .addActionListener(event -> System.exit(0));
        }};

        var menuEdit = new JMenu("Edit") {{
            add(new JMenuItem("Undo"));
            addSeparator();
            add(new JMenuItem("Cut"));
            add(new JMenuItem("Copy"));
            add(new JMenuItem("Paste"));
            add(new JMenuItem("Delete"));
            addSeparator();
            add(new JMenuItem("Start search"));
            add(new JMenuItem("Previous search"));
            add(new JMenuItem("Next match"));
            add(new JMenuItem("Replace"));
            addSeparator();
            add(new JMenuItem("Select All"));
        }};

        var menuFormat = new JMenu("Format") {{
            add(new JMenuItem("Font"));
        }};

        add(menuFile);
        add(menuEdit);
        add(menuFormat);
    }
}
