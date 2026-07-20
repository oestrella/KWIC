package kwic;

import java.util.ArrayList;
import java.util.List;

public class LineStorage {

    // List is an interface that is implemented by ArrayList

    // "lines" are a list of lists of Strings
    // because an input line is a list of Strings aka "list of words"
    private final List<List<String>> lines = new ArrayList<>();

    public void addLine(List<String> words) {
        this.lines.add(new ArrayList<>((words)));
    }

    public List<List<String>> getLines() {
        return this.lines;
    }

    public String getWord(int lineIndex, int wordIndex) {
        return this.lines.get(lineIndex).get(wordIndex);
    }

    public int getLineCount() {
        return this.lines.size();
    }

    public int getWordCount(int lineIndex) {
        return this.lines.get(lineIndex).size();
    }

}
