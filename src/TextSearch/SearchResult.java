package TextSearch;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SearchResult {
    private final List<SearchItem> foundAllIndex = new ArrayList<>();
    private int currentIndex = -1;

    public SearchItem getNext() {
        currentIndex++;
        if (currentIndex == foundAllIndex.size()) {
            currentIndex = 0;
        }
        return foundAllIndex.get(currentIndex);
    }

    public SearchItem getPrev() {
        currentIndex--;
        if (currentIndex < 0) {
            currentIndex = foundAllIndex.size() - 1;
        }
        return foundAllIndex.get(currentIndex);
    }

    public SearchItem getElement() {
        return foundAllIndex.get(currentIndex);
    }

    public boolean hasResult() {
        return foundAllIndex.size() > 0;
    }

    public void searchText(String pattern, String text, JCheckBox useRegex) {
        Search searchObject;

        if (!useRegex.isSelected()) {
            searchObject = new SimpleSearch(pattern, text, foundAllIndex);
        }
        else {
            searchObject = new RegexSearch(pattern, text, foundAllIndex);
        }

        searchObject.search();
    }
}
