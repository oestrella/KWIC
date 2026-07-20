package kwic;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Output {

    public void print(Alphabetizer alpha) throws FileNotFoundException {

        // Print to System output
        for (int i = 0; i < alpha.getAlphaSize(); i++) {
            System.out.println(alpha.getAlphaLine(i));
        }

        // Generate output.txt file
        try (PrintWriter writer = new PrintWriter("output.txt")) {
            for (int i = 0; i < alpha.getAlphaSize(); i++) {
                writer.println(alpha.getAlphaLine(i));
            }
        }

    }
}
