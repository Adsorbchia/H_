package HW3.Task2;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileManager {

    public static void writeFile(String words,String nameFile)throws java.io.IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nameFile))){
            writer.write(words);}
    }

    public static void readFile(String nameFile) throws FileNotFoundException, IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(nameFile))){
            String firstSting = reader.readLine();
            System.out.println(firstSting);}
    }

    public static void copyFile(String nameFile1, String nameFile2)throws IOException{
        File file1 = new File(nameFile1);
        File file2 = new File(nameFile2);
        Files.copy(file1.toPath(),file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }


}

