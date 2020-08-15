package TextSearch;

import java.util.List;

public class SimpleSearch extends Search {


    public SimpleSearch(String pattern, String text, List<SearchItem> matches) {
        super(pattern, text, matches);
    }

    private int[] prefixFunction(String str) {
        int[] prefixFunc = new int[str.length()];

        for (int i = 1; i < str.length(); i++) {
            int j = prefixFunc[i - 1];

            while (j > 0 && str.charAt(i) != str.charAt(j)) {
                j = prefixFunc[j - 1];
            }

            if (str.charAt(i) == str.charAt(j)) {
                j += 1;
            }

            prefixFunc[i] = j;
        }

        return prefixFunc;
    }

    @Override
    public void search() {
        this.matches.clear();
        int[] prefixFunc = prefixFunction(pattern);
        int j = 0;

        for (int i = 0; i < text.length(); i++) {

            while (j > 0 && text.charAt(i) != pattern.charAt(j)) {
                j = prefixFunc[j - 1];
            }

            if (text.charAt(i) == pattern.charAt(j)) {
                j += 1;
            }

            if (j == pattern.length()) {
                matches.add(new SearchItem(i - j + 1, this.pattern.length()));
                j = prefixFunc[j - 1];
            }
        }
    }
}