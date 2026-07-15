package T44;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class T44 {
    public static void main(String[] args){
        String filePath = "C:\\Users\\user\\Documents\\Programming\\JAVA\\YT Tutorials\\T44\\test.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }
}
