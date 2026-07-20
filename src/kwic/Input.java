package kwic;

import java.util.Arrays;
import java.util.List;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;

// Main Control object has a String of the source's filename.
// Reads the input file source and parses by line.
// Pushes the parsed lines to an instance of LineStorage


public class Input {

    public void parse(String fileName, LineStorage lines) throws IOException {

        // Regex for setting spaces as the delimiter
        String delimiter = "\\s+";

        // Read one line at a time, passed as a Stream of Strings
        try (Stream<String> rawLines = Files.lines(Paths.get(fileName))) {

            // Map each line to be a Stream of type List<String>, use delimiter to make words the array elements
            Stream<List<String>> parsedLines = rawLines.map(line -> Arrays.asList(line.split(delimiter)));

            // For each List<String>, call LineStorage lines.addLines method to store the word lists
            parsedLines.forEach(lines::addLine);

        }


    }

}
