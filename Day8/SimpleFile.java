package Day8;
import java.io.*;

public class SimpleFile {
    public static void main(String[] args) {
        try {
            File file = new File("Kartik1.txt"); // --> new file creation
            if (file.createNewFile())
                System.out.println("File created: " + file.getName());
            else
                System.out.println("File exists.");

            
            FileWriter writer = new FileWriter(file); // --> Writer
            writer.write("Kartik Pohekar \nHelloo how are you?");
            writer.close();
            System.out.println("Successfully written on the file.");

            FileReader reader = new FileReader(file); // --> Reader
            int ch;
            System.out.println("Content in the file : ");
            while ((ch = reader.read()) != -1)
                System.out.print((char) ch);
            reader.close();
        }   catch (IOException e) {
            e.printStackTrace();
        }
    }
}