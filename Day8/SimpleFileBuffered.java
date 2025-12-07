package Day8;
import java.io.*;

public class SimpleFileBuffered {
    public static void main(String[] args) {
        try {
            File file = new File("Kartikbuffered.txt"); // file creation
            if (file.createNewFile())
                System.out.println("File created: " + file.getName());
            else
                System.out.println("File already exists.");

            BufferedWriter writer = new BufferedWriter(new FileWriter(file)); // BufferedWriter
            writer.write("Kartik Pohekar");
            writer.newLine();
            writer.write("Helloo how are you?");
            writer.close();
            System.out.println("Successfully written to the file using BufferedWriter.");

            BufferedReader reader = new BufferedReader(new FileReader(file)); // BufferedReader
            String line;
            System.out.println("Content in the file:");
            while ((line = reader.readLine()) != null)
                System.out.println(line);
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
