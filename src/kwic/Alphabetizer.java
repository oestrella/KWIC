package kwic;

import java.util.ArrayList;
import java.util.List;

public class Alphabetizer {

    private final List<String> alphaLines;

    public Alphabetizer() {
        alphaLines = new ArrayList<>();
    }

    public void alpha(CircularShifter shifter) {

        // Start with an empty ArrayList, then fill it
        alphaLines.clear();

        for (int i = 0; i < shifter.getShiftedSize(); i++){
            alphaLines.add(shifter.getShiftedLine(i));
        }

        // Second parameter is necessary as lowercase letters would be placed after
        // Uppercase letters without it. Ex: Zebra would go before apple without it
        alphaLines.sort(String.CASE_INSENSITIVE_ORDER);
    }

    public int getAlphaSize() {
        return this.alphaLines.size();
    }

    public String getAlphaLine(int index) {
        return this.alphaLines.get(index);
    }
}
