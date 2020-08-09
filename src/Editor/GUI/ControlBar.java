package Editor.GUI;

import javax.swing.*;
import java.awt.*;

public class ControlBar extends JToolBar {

    public ControlBar(String name) {
        super(name);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        setFloatable(false);

        var openButton = new JButton();
        openButton.setName("saveButton");

        var saveButton = new JButton();
        saveButton.setName("saveButton");

        var searchField = new JTextField(30);
        //searchField.setMinimumSize(new Dimension(15, 15));
        searchField.setName("searchField");

        var searchButton = new JButton();
        searchButton.setName("searchButton");

        var nextButton = new JButton();
        nextButton.setName("nextButton");

        var prevButton = new JButton();
        prevButton.setName("prevButton");

        add(openButton);
        add(saveButton);
        add(searchField);
        add(searchButton);
        add(nextButton);
        add(prevButton);


    }
}
