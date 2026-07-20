package kwic;

import java.io.IOException;

public class KWIC {
    public void execute(String file) throws IOException {
        LineStorage lines = new LineStorage();
        Input input = new Input();
        CircularShifter shifter = new CircularShifter();
        Alphabetizer alphabetizer = new Alphabetizer();
        Output output = new Output();


        input.parse(file, lines);
        shifter.setup(lines);
        alphabetizer.alpha(shifter);
        output.print(alphabetizer);

        // Used to test CircularShifter; Uncomment line to try
        //for (int i = 0; i < shifter.getShiftedSize(); i++) System.out.println(shifter.getShiftedLine(i));

        // Used to test Alphabetizer; Uncomment line to try
        //for (int i = 0; i < alphabetizer.getAlphaSize(); i++) System.out.println(alphabetizer.getAlphaLine(i));


    }

    static void main() throws IOException {
        new KWIC().execute("input.txt");
    }
}
