package TextSearch;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSearch extends Search {
    public RegexSearch(String pattern, String text, List<SearchItem> matches) {
        super(pattern, text, matches);
    }

    @Override
    public void search() {
        Pattern regExPattern = Pattern.compile(this.pattern);
        Matcher matcher = regExPattern.matcher(this.text);
        int length = matcher.end() - matcher.start();
        this.matches.clear();
        while (matcher.find()) {
            this.matches.add(new SearchItem(matcher.start(), length));
        }
    }
}
