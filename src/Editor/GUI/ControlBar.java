package Editor.GUI;

import Editor.Action.ActionFactory;

import javax.swing.*;
import java.awt.*;

public class ControlBar extends JToolBar {

    private final JTextField searchField;
    private final JCheckBox checkBoxOfUseRegex;

    public ControlBar(ActionFactory factory) {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        setFloatable(false);

        var openButton = new JButton(factory.getOpenFileActionForControlBar());
        openButton.setName("openButton");

        var saveButton = new JButton(factory.getSaveFileActionForControlBar());
        saveButton.setName("saveButton");

        searchField = new JTextField(20);
        searchField.setPreferredSize(new Dimension(30,36));
        searchField.setFont(new Font("SansSerif", Font.PLAIN, 20));
        searchField.setName("searchField");

        var searchButton = new JButton(factory.getSearchTextActionForControlBar());
        searchButton.setName("searchButton");

        var prevButton = new JButton(factory.getPreviousTextActionForControlBar());
        prevButton.setName("prevButton");

        var nextButton = new JButton(factory.getNextTextActionForControlBar());
        nextButton.setName("nextButton");

        checkBoxOfUseRegex = new JCheckBox("Use regex");

        add(openButton);
        add(saveButton);
        add(searchField);
        add(searchButton);
        add(prevButton);
        add(nextButton);
        add(checkBoxOfUseRegex);
    }

    public JTextField getSearchField() {
        return searchField;
    }

    public JCheckBox getCheckBoxOfUseRegex() {
        return checkBoxOfUseRegex;
    }

}
