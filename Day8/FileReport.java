package Day8;
import java.io.*;

public class FileReport {
    public static void main(String[] args) {
        try {
            File essay = new File("essay.txt");
            if (essay.createNewFile()) {
                FileWriter writer = new FileWriter(essay);
                writer.write("This is the first line.\n");
                writer.write("Here is the second line with more words.\n");
                writer.write("Finally, this is the third line.");
                writer.close();
            }

            BufferedReader reader = new BufferedReader(new FileReader("essay.txt"));
            String line;
            int lineCount = 0;
            int wordCount = 0;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) wordCount += words.length;
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("report.txt"));
            writer.write("Total number of lines: " + lineCount + "\n");
            writer.write("Total number of words: " + wordCount + "\n");
            writer.close();

            System.out.println("Report generated successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
