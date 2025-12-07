package Day8;
import java.io.*;

public class MergeFiles {
    public static void main(String[] args) {
        try {
            File file1 = new File("file1.txt");
            File file2 = new File("file2.txt");

            if (file1.createNewFile()) {
                FileWriter fw1 = new FileWriter(file1);
                fw1.write("Line 1 from File 1\n");
                fw1.write("Line 2 from File 1\n");
                fw1.write("Line 3 from File 1\n");
                fw1.close();
            }

            if (file2.createNewFile()) {
                FileWriter fw2 = new FileWriter(file2);
                fw2.write("Line 1 from File 2\n");
                fw2.write("Line 2 from File 2\n");
                fw2.close();
            }

            BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("merged.txt"));

            String line1, line2;

            while (true) {
                line1 = br1.readLine();
                line2 = br2.readLine();

                if (line1 == null && line2 == null)
                    break;

                if (line1 != null)
                    bw.write(line1 + "\n");

                if (line2 != null)
                    bw.write(line2 + "\n");
            }

            br1.close();
            br2.close();
            bw.close();

            System.out.println("Merge completed successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
