package kwic;

import java.util.ArrayList;
import java.util.List;

public class CircularShifter {

    private final List<String> sLines;

    public CircularShifter() {
        this.sLines = new ArrayList<String>();
    }

    public void setup(LineStorage lines) {

        for (int lineIndex = 0; lineIndex < lines.getLineCount(); lineIndex++) {
            int size = lines.getWordCount(lineIndex);

            // Cover empty input case
            if (size == 0) continue;

            // We'll use indexing to do the shifting
            // integer i will select the starting word
            // integer j will cycle through all the words, appending to the string builder
            for (int i = 0; i < size; i++) {

                StringBuilder sLine = new StringBuilder();
                for (int j = 0; j < size; j++) {

                    int index = (i + j) % size;

                    // first word case: no space is added before the word
                    if (j > 0) sLine.append(" ");

                    sLine.append(lines.getWord(lineIndex, index));
                }

                this.sLines.add(sLine.toString());
            }
        }
    }

    public int getShiftedSize() {
        return this.sLines.size();
    }

    public String getShiftedLine(int index) {
        return sLines.get(index);
    }

    public List<String> getShiftedLines() {
        return this.sLines;
    }
}
