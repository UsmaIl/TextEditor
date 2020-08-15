package TextSearch;

import javax.swing.*;
import java.util.List;

abstract class Search extends SwingWorker<Integer, String> {

    protected String pattern;
    protected String text;
    protected List<SearchItem> matches;

    abstract protected void search();

    public Search(String pattern, String text, List<SearchItem> matches) {
        this.pattern = pattern;
        this.text = text;
        this.matches = matches;
    }

    @Override
    protected Integer doInBackground() {
        this.search();
        return 0;
    }
}