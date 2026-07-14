package T43;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class T43 {
    public static void main(String[] args){
        //FileWriter: Logic & Function

        String filePath = "C:\\Users\\user\\Documents\\Programming\\JAVA\\YT Tutorials\\T43\\Test.text";
        String textContent = """
                I want to learn Java
                I want to be rich
                I want to travel the world
                """;

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File has been written");
        } 
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Could not locate file location");
        }
        
    }

    
}
