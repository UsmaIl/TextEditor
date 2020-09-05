package Editor.GUI;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

public class TextArea extends JTextArea {
    private Highlighter highlighter;

    public TextArea() {
        setEditable(true);
        setLineWrap(true);
        setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(),
                BorderFactory.createEmptyBorder(0, 3, 0, 3)));
        setName("TextArea");
    }

    public void selectCurrentText(int startIndex, int endIndex) {
        setCaretPosition(startIndex + endIndex);
        select(startIndex, startIndex + endIndex);
        requestFocusInWindow();
    }

    public void selectAllText(int startIndex, int endIndex) {
        highlighter = this.getHighlighter();
        try {
            highlighter.addHighlight(startIndex, startIndex + endIndex, DefaultHighlighter.DefaultPainter);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }

    public void removeAllHighlighte() {
        if (highlighter != null) {
            highlighter.removeAllHighlights();
        }
    }

}
