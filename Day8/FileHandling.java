package Day8;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandling {
    public static void main(String[] args)  throws IOException{
        //create file
        File f = new File("secondfile.txt");
         if (f.createNewFile()) {
                System.out.println("created file");
            } else {
                System.out.println("not created");
            }
        //to write file
         FileWriter writer = new FileWriter(f);
         writer.write("Hello");
         writer.close();
         //to read file
         BufferedReader br = new BufferedReader(new FileReader(f));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        System.out.println("Data written succesfully");
        System.out.println("File name: " + f.getName());
        System.out.println("File absolute path: " + f.getAbsolutePath());
    }
}