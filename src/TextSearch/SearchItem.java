package TextSearch;

public class SearchItem {
    private final int index;
    private final int length;

    public SearchItem(int index, int length) {
        this.index = index;
        this.length = length;
    }

    public int getIndex() {
        return this.index;
    }

    public int getLength() {
        return this.length;
    }
}
