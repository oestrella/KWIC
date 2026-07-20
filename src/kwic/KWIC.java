package kwic;

import java.io.FileNotFoundException;
import java.io.IOException;

public class KWIC {
    public void execute(String file) throws FileNotFoundException, IOException {
        LineStorage lines = new LineStorage();
        Input input = new Input();
        CircularShifter shifter = new CircularShifter();
        Alphabetizer alphabetizer = new Alphabetizer();
        Output output = new Output();


        input.parse(file, lines);
        shifter.setup(lines);

        // Used to test CircularShifter; Uncomment to try
        for (int i = 0; i < shifter.getShiftedSize(); i++) System.out.println(shifter.getShiftedLine(i));


        // TODO: Alphabetizer alpha(),
        // alphabetizer.alpha(shifter);
        // TODO: Output print(),
        // output.print(alphabetizer);
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        new KWIC().execute("input.txt");
    }
}
