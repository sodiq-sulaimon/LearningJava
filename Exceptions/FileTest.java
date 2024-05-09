import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args){
        String inputFileName = args[0];
        String word = args[1];

        File fileIn = new File(inputFileName);
        File fileOut = new File(word +"In" + inputFileName);

        Scanner fileScan = null;
        PrintWriter filePrint = null;

        try {
            fileScan = new Scanner(fileIn);
            filePrint = new PrintWriter(fileOut);
            int lineCount = 0;
            System.out.printf("Lines in %s containing %s: \n",
                    args[0], args[1]);

            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                if (line.contains(word)) {
                    System.out.println(lineCount + ": " + line);
                    filePrint.println(lineCount + ": " + line);
                }
                lineCount++;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (fileScan != null) {
                fileScan.close();
            }
            if (filePrint != null) {
                filePrint.close();
            }
        }
    }
}