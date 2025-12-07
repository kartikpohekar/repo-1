package Day8;
import java.io.*;
import java.nio.file.*;

public class FileOperations {
    public static void main(String[] args) {
        try {
            File file = new File("Kartik1.txt"); // create
            if (file.createNewFile())
                System.out.println("File created: " + file.getName());
            else
                System.out.println("File already exists.");

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("Kartik Pohekar");
            writer.newLine();
            writer.write("Hello, how are you?");
            writer.close();
            System.out.println("Data written successfully.");

            // Rename file
            File renamedFile = new File("Kartik_Renamed.txt");
            if (file.renameTo(renamedFile))
                System.out.println("File renamed to: " + renamedFile.getName());
            else
                System.out.println("Rename failed.");

            // Copy file
            Path sourcePath = renamedFile.toPath();
            Path copyPath = Paths.get("Kartik_Copy.txt");
            Files.copy(sourcePath, copyPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied as: " + copyPath.getFileName());

            // Move file
            Path movedPath = Paths.get("C:\\Users\\karti\\OneDrive\\Desktop\\WIPRO PRE SKILL TRAINING\\Day8_Moved.txt");
            Files.move(copyPath, movedPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved and renamed to: " + movedPath.getFileName());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
