package Editor.GUI;

import Editor.Action.ActionFactory;

import javax.swing.*;

public class ReplaceDialog extends JDialog {

    private final JTextField textFieldForSearch;
    private final JTextField textFieldForReplace;
    private final JCheckBox checkBoxUseRegex;

    public ReplaceDialog(ActionFactory factory) {
        setLayout(null);

        JLabel labelFindWhat = new JLabel("Find what");
        textFieldForSearch = new JTextField();

        JLabel labelReplaceWith = new JLabel("Replace with: ");
        textFieldForReplace = new JTextField();

        checkBoxUseRegex = new JCheckBox("Match case");

        JButton buttonFind = new JButton(factory.getSelectAllFoundTextActionForReplaceDialog());
        JButton buttonReplace = new JButton();
        JButton buttonReplaceAll = new JButton("Replace All");
        JButton buttonCancel = new JButton("Cancel");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelFindWhat)
                        .addComponent(labelReplaceWith))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(textFieldForSearch)
                        .addComponent(textFieldForReplace)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(checkBoxUseRegex))))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(buttonFind)
                        .addComponent(buttonReplace)
                        .addComponent(buttonReplaceAll)
                        .addComponent(buttonCancel))
        );

        layout.linkSize(SwingConstants.HORIZONTAL, buttonFind, buttonReplace, buttonReplaceAll,  buttonCancel);

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(labelFindWhat)
                        .addComponent(textFieldForSearch)
                        .addComponent(buttonFind))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(labelReplaceWith)
                        .addComponent(textFieldForReplace)
                        .addComponent(buttonReplace))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonReplaceAll))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(checkBoxUseRegex)
                        .addComponent(buttonCancel))))
        );
        setTitle("Replace");
        pack();
    }


    public JTextField getTextFieldForSearch() {
        return textFieldForSearch;
    }

    public JTextField getTextFieldForReplace() {
        return textFieldForReplace;
    }

    public JCheckBox getCheckBoxUseRegex() {
        return checkBoxUseRegex;
    }
}
